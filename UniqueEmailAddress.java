package NeetCode;

import java.util.HashSet;

public class UniqueEmailAddress {
    public static int uniqueEmailAddress(String[] emails){
        HashSet<String> set = new HashSet<>();

        for(String email : emails){
            StringBuilder sb = new StringBuilder();

            int indexOfAt = email.indexOf("@");

            for(int i=0;i<indexOfAt;i++){
                if(email.charAt(i) == '.'){
                    continue;
                }
                if(email.charAt(i) == '+'){
                    break;
                }
                sb.append(email.charAt(i));
            }

            sb.append(email.substring(indexOfAt));

            set.add(sb.toString());
        }


        return set.size();
    }
}
