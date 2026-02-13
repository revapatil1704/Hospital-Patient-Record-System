package HospitalPatientRecorde;

import java.sql.*;

public class PatientDAO {

    // ADD
    void addPatient(String name, int age, String disease) {
        try {
            Connection con = DB.getConnection();
            String q = "INSERT INTO patients(name, age, disease) VALUES(?,?,?)";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, disease);
            ps.executeUpdate();
            System.out.println("Patient Added");
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }

    // VIEW
    void viewPatients() {
        try {
            Connection con = DB.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM patients");

            while (rs.next()) {
                System.out.println(
                    rs.getInt(1) + " " +
                    rs.getString(2) + " " +
                    rs.getInt(3) + " " +
                    rs.getString(4)
                );
            }
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }

    // DELETE
    void deletePatient(int id) {
        try {
            Connection con = DB.getConnection();
            String q = "DELETE FROM patients WHERE id=?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Patient Deleted");
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}




