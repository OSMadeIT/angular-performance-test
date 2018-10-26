package com.osmadeit.angular.rest;

import java.io.File;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

/**
 *
 * @author os
 */
@Path("/excel")
public class ExcelFileService {
    //Absolute file path
    private static final String FILE_PATH = "C:\\Users\\litem\\OneDrive\\Documents\\Projects\\Angular\\angular-school-test-ui\\src\\app\\new-student\\files\\newStudentSheet.xls";
	
	//API endpoint
	@GET
	@Path("/get")
	@Produces("application/vnd.ms-excel")
	public Response getFile() {

		File file = new File(FILE_PATH);

		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
			"attachment; filename=new-excel-file.xls");
		return response.build();

	}

}
