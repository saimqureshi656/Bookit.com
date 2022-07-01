
package prjct;

import com.email.durgesh.Email;

public class emailsender {
public static void emailll(String email1,String subject,String content ,String type){
try{
Email email=new Email("saimqureshi656@gmail.com","wxuqfziwjjsplmff");
email.setFrom("saimqureshi656@gmail.com","BOOKIT.COM");
email.setSubject(subject);
email.setContent(content,type);
email.addRecipient(email1);
email.send();
}catch(Exception e){


}

}    
}
