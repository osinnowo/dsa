import java.util.*;

public class UniqueEmailAddress {
    public int numUniqueEmails(String[] emails) {
       Set<String> uniqueEmails = new HashSet<>();
       for (String email : emails) {
           int atIndex = email.indexOf('@');
           String localName = email.substring(0, atIndex);
           String domainName = email.substring(atIndex + 1);
           // handle plus sign
           int plusIndex = localName.indexOf('+');
           if (plusIndex != -1) {
               localName = localName.substring(0, plusIndex);
           }
           // handle periods
           localName = localName.replace(".", "");
           // add to set of unique email addresses
           uniqueEmails.add(localName + "@" + domainName);
       }
       return uniqueEmails.size();
   }
}
