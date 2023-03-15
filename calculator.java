import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter your statement");
        String k = sc.nextLine();
        sc.close();
        char l[] = k.toCharArray();
        int a = 0;
        int b = 0;
        char op = ' ';
        char aa[] = new char[k.length()];
        char bb[] = new char[k.length()];
        int z = 0 ;
        for ( z = 0; z < k.length() ; z++) {
            if ( l[z] != '+' && l[z] != '-' && l[z] != '/' && l[z] != '*') {
                if(l[z] == ' ')
                {
                    break;
                }
                else{

                
                aa[z] = l[z];
                }

            }
        }
        int i = 0;
        for (i = 0; i < k.length() ; i++) {
            if (l[i] == '+' || l[i] == '-' || l[i] == '/' || l[i] == '*') {
                op = l[i];
                break;
            }
        }

        for (int m = i; m < k.length() ; m++) {
            if (l[m] != ' ' && l[m] != '+' && l[m] != '-' && l[m] != '/' && l[m] != '*') {
                if(l[m] == ' ')
                {
                    break;
                }
                else{

                
                bb[m-i] = l[m];
                }

            }

        }
        for (int p = 0 ; p < k. length() ; p++)
        {
            if(aa[p]=='\u0000'){
                aa[p] = ' ';
            }
        }
        for (int p = 0 ; p < k. length() ; p++)
        {
            if(bb[p]=='\u0000'){
                bb[p] = ' ';
            }
        }
        String m = new String(aa);
        m = m.replaceAll("\\s", "");
        
        String u = new String(bb);
        u = u.replaceAll("\\s", "");
        a = Integer.valueOf(m);
        b= Integer.valueOf(u);
        
        
       
        

        
       
        int res = 0;
        if (op == '+') {
            res = a + b;
        } else if (op == '-') {
            res = a - b;
        } else if (op == '*') {
            res = a * b;
        } else if (op == '/') {
            res = a / b;
        } else {
            System.out.println("wrong operator");
        }
        System.out.println(res);
       
    }

}
