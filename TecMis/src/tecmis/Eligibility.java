/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecmis;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class Eligibility {
    
    private String sub=null;
    private String id=null;
    
    DB db = new DB();

    public Eligibility() {
        db.getconnect();
    }
    
    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
  
    String getTotalEligibility(String id,String sub)
    {
            float t=getTheoryEligibility(id,sub);
            float p=getPracticalEligibility(id,sub);

            return getFinalEligible(getEligible(t),getEligible(p));
    }
    
    float getTheoryEligibility(String id,String sub)
{
        try {
         String q="select count(stu_id) from attendances where at_st_id='"+id+"' and at_sub_id='"+sub+"' and at_type='T' and at_status='1'";
         PreparedStatement ps=db.conn.prepareStatement(q);
         ResultSet rs=ps.executeQuery(q);
         
         if(rs.next())
         {
             int c=rs.getInt("count(stu_id)");
             int total=c+getMedicalTheory(id,sub);
             return (float)total/15*100;	
         }
    } catch (Exception e) {
    }
	return 0;

	
}

 float getPracticalEligibility(String id,String sub)
{

	try {
         String q="select count(stu_id) from attendances where at_st_id='"+id+"' and at_sub_id='"+sub+"' and at_type='P' and at_status='1'";
         PreparedStatement ps=db.conn.prepareStatement(q);
         ResultSet rs=ps.executeQuery(q);
         
         if(rs.next())
         {
             int c=rs.getInt("count(me_st_id)");
             int total=c+getMedicalPractical(id,sub);
             return (float)total/15*100;	
         }
    } catch (Exception e) {
    }
	return 0;
}

int getMedicalTheory(String id,String sub)
{
        try {
        
            String q="select count(me_st_id) from medicals  where me_st_id='"+id+"' and me_sub_id='"+sub+"' and me_type='T'";
            PreparedStatement ps=db.conn.prepareStatement(q);
            ResultSet rs=ps.executeQuery(q);
         
         if(rs.next())
         {
              return (int)rs.getInt("count(stu_id)");
         }
    } catch (Exception e) {
    }
        
	return 0;
}
int getMedicalPractical(String id,String sub)
{

	 try {
        
            String q="select count(stu_id) from medical  where me_st_id='"+id+"' and me_sub_id='"+sub+"' and me_type='P'";
            PreparedStatement ps=db.conn.prepareStatement(q);
            ResultSet rs=ps.executeQuery(q);
         
         if(rs.next())
         {
              return (int)rs.getInt("count(me_st_id)");
         }
    } catch (Exception e) {
    }
        
	return 0;
}

String getEligible(float total)
{
   
	if(total>=80)
        {
            return "Eligible";
        }
	else
        {
            return "Not Eligible";
        }
			
}

String getFinalEligible(String theory,String pra)
{
    if(theory.equals("Eligible") && pra.equals("Eligible"))
    {
        return "Eligible";
    }
    else
        {
            return "Not Eligible";
        }
}
    
}
