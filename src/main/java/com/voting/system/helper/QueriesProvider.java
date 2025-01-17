package com.voting.system.helper;

public class QueriesProvider {
	
	public static String filePath = "C:\\Users\\prati\\eclipse-workspace\\Voting_Application\\src\\main\\webapp\\assets\\images";

	public static String queryForStudentInfo = "select  " + "student.id, " + "student.firstName, "
			+ "student.middleName, " + "student.lastName, " + "student.enrolment_number, " + "student.address, "
			+ "student.email, " + "student.pass, " + "student.student_image, " + "branch.branch_name, "
			+ "acc_year.year_name " + "from student " + "inner join branch on student.branch_id = branch.id "
			+ "inner join acc_year on student.year_id = acc_year.id ";

	public static String queryForWardenInfo = "select " + " warden.id , " + " warden.firstName , "
			+ " warden.middleName , " + " warden.lastName , " + " warden.address , " + " warden.email , "
			+ " warden.pass , " + " warden.phoneNumber , " + " warden.warden_image , " + " warden.warden_status , "
			+ " warden.branch_id , " + " warden.year_id, " + " branch.branch_name, " + "acc_year.year_name"
			+ " from warden " + " inner join branch on warden.branch_id = branch.id "
			+ " inner join acc_year on warden.year_id = acc_year.id ";

	public static String queryForStudentInfoWithBranchAndYearId = "select " + "student.id, " + "student.firstName, "
			+ "student.middleName, " + "student.lastName, " + "student.enrolment_number, " + "student.address, "
			+ "student.email, " + "student.pass, " + "student.student_image, " + "student.branch_id,"
			+ "branch.branch_name, " + "student.year_id,"
			+ "student.phone_number,"
			
			+ "acc_year.year_name " + "from student "
			+ "inner join branch on student.branch_id = branch.id "
			+ "inner join acc_year on student.year_id = acc_year.id ";

	public static String queryForUpdatingStudent = "UPDATE student SET" + " firstName = ?," + " middleName = ?,"
			+ " lastName = ?,  " + " enrolment_number = ?," + " address = ?," + " email = ?," + " pass = ?,"
			+ " branch_id = ?," + " year_id = ?";

	public static String insertIntoWarden = "insert into warden " + "( firstName ," + "middleName ," + "lastName ,"
			+ "address ," + "email ," + "pass ," + "phoneNumber ," + "warden_image ," + "warden_status ,"
			+ "branch_id ," + "year_id )" + "values(?,?,?,?,?,?,?,?,?,?,?)";

	public static String updateWardenQuery = "UPDATE warden SET " + "firstName  = ? ," + "middleName  = ? ,"
			+ "lastName  = ? ," + "address  = ? ," + "email  = ? ," + "pass  = ? ," + "phoneNumber  = ? ,"
			+ "warden_status  = ? ," + "branch_id = ? ," + "year_id = ? ";

	public static String CandidateInfo = "select " + 
			" candidate.id ," +

			" student.firstName , " +
			" student.middleName , " +
			" student.lastName , " +

			" election.election_name   , " +
			" election.election_status , " +

			" candidate.id ," +
			" candidate.student_id , " +
			" candidate.election_id , " +
			" candidate.partyName , " +
			" candidate.partySymbol , " +
			"candidate.slogan " +
			
			"from candidate "+
			"inner join student on candidate.student_id =  student.id " +
			"inner join election on candidate.election_id =  election.id " ;
	
	
	
	public static String candiateCampainQuery = "select " + 
			"candidate.id, "+
			"candidate.partyName, "  +
			"candidate.partySymbol, "  +
			"candidate.slogan , " +
			"candidate.election_id,"+
			"student.id as student_id, "+
			"student.firstName, "  +
			"student.middleName, "  +
			"student.lastName, " +
			"student.student_image, " +
			"branch.branch_name, " +
			"acc_year.year_name " +
			"from candidate " + 
			"inner join student on student.id = candidate.student_id " +
			"inner join branch on branch.id = student.branch_id " +
			"inner join acc_year on acc_year.id = student.year_id " +
			"where election_id = ?";


}
