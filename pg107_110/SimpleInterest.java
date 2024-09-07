import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

class SimpleInterest{
    void getSI(double p,float r,int t){
        double SI = (p*r*t)/100;
        System.out.println("interest is: "+SI);
        double ta = p+SI;
        System.out.println("total amount: "+ta);
    }
    public static void main(String[] args) {
        SimpleInterest si = new SimpleInterest();
        if(args.length >=3){
            String s1 = args[0].trim();
            double p = Double.parseDouble(s1);
            //Double d1 = new Double(s1);depreciated since java9
            //double p = d1.doubleValue();
            float r = Float.parseFloat(args[1].trim());
            int t = Integer.parseInt(args[2].trim());
            si.getSI(p, r, t);
            //Integer i = new Integer(s1)
        }
        else
            System.out.println("improper command line arguments");
    }
}