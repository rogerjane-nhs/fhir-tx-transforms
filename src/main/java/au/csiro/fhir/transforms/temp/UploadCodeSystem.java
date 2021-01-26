package au.csiro.fhir.transforms.temp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.hl7.fhir.r4.model.CodeSystem;
import org.hl7.fhir.r4.model.Identifier;
import org.hl7.fhir.r4.model.CodeSystem.CodeSystemContentMode;
import org.hl7.fhir.r4.model.CodeSystem.CodeSystemHierarchyMeaning;
import org.hl7.fhir.r4.model.Enumerations.PublicationStatus;

import au.csiro.fhir.transforms.helper.FHIRClientR4;
import au.csiro.fhir.transforms.helper.FeedClient;
import au.csiro.fhir.transforms.helper.FeedUtility;
import au.csiro.fhir.transforms.helper.Utility;
import au.csiro.fhir.transforms.helper.atomio.Entry;
import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.parser.IParser;

public class UploadCodeSystem {
	
	String workingFolder = "M:\\NHS\\NHS-bid\\Resource\\Read V2\\READ-4Byte-Apr2009-ClaML";
	String uploadFolder = "M:\\NHS\\NHS-bid\\Resource\\Read V2\\READ-4Byte-Apr2009-ClaML\\upload";
	String ontoServer = "http://ontoserver.it.csiro.au/fhir";

	FeedClient feedClient = new FeedClient();
	
	FHIRClientR4 fhirClientR4 = new FHIRClientR4(ontoServer);

	
	public void updateReadV2(String jsonFileName) throws IOException {
		
		FhirContext ctx = FhirContext.forR4();
		IParser parser = ctx.newJsonParser();
		File inputFile = new File(workingFolder, jsonFileName);
		BufferedReader input  = new BufferedReader(new FileReader(inputFile));
		CodeSystem codeSystem  = parser.parseResource(CodeSystem.class, input);
		input.close();
		
		String title = codeSystem.getId().replaceAll("CodeSystem", "").replaceAll("-", " ").replaceAll("/", "");
		String url = codeSystem.getUrl();
		String version = "20090401";
		Identifier ident = new Identifier();
		
	    ident.setSystem("urn:ietf:rfc:3986");
	    ident.setValue("urn:oid: 2.16.840.1.113883.6.29");
		codeSystem.setId(title.replaceAll("\\s", "-"));
		codeSystem.addIdentifier(ident);
		codeSystem.setValueSet(url +"/vs")
				.setName(title.replaceAll("\\s", "_")).setVersion(version).setTitle(title)
				.setStatus(PublicationStatus.RETIRED).setExperimental(true).setPublisher("NHS UK")
				.setContent(CodeSystemContentMode.COMPLETE)
				.setHierarchyMeaning(CodeSystemHierarchyMeaning.CLASSIFIEDWITH)
				.setCopyright(
						"Copyright © 2020 Health and Social Care Information Centre. NHS Digital is the trading name of the Health and Social Care Information Centre.")
				.setPublisher("NHS Digital")
				.setDescription(title + " FHIR CodeSystem");

		System.out.println(codeSystem.getId());
		System.out.println(codeSystem.getTitle());
		System.out.println(codeSystem.getStatus().toString());
		System.out.println(codeSystem.getExperimental());
		
		File bodyFile = new File(uploadFolder, jsonFileName);
		Utility.toTextFile(ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(codeSystem),bodyFile);

		Entry entry = FeedUtility.createFeedEntry_CodeSystem(codeSystem, jsonFileName);
		String entryFileName = Utility.jsonFileNameToEntry(jsonFileName);
		Utility.toTextFile(FeedUtility.entryToJson(entry), new File(uploadFolder,  entryFileName));
		
		feedClient.updateEntryToNHSFeed(entry, new File(uploadFolder,entryFileName), bodyFile);
		fhirClientR4.createUpdateCodeSystem(codeSystem);

	}
	
	public static void main(String[] args) throws IOException {
		UploadCodeSystem uploadCodeSystem = new UploadCodeSystem();
		//uploadCodeSystem.updateReadV2("CodeSystem-Read-4Byte-GP4.json");
	   // uploadCodeSystem.updateReadV2("CodeSystem-Read-4Byte-GP4SCOT.json");
		//uploadCodeSystem.updateReadV2("CodeSystem-Read-4Byte-GP5.json");
		//uploadCodeSystem.updateReadV2("CodeSystem-Read-4Byte-GP5SCOT.json");
		uploadCodeSystem.updateReadV2("CodeSystem-READ-4Byte-UNIFIED.json");
		//uploadCodeSystem.updateReadV2("CodeSystem-READ-4Byte-UNISCOT.json");
	}
}
