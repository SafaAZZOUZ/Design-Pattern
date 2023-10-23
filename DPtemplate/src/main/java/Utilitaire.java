public abstract class Utilitaire {
    public  double compute(String str){
        int size=str.length();
        double resultat=0;
        for (int i = 0; i <size ; i++) {
            double x=filter1(str);
            resultat+=1*x;
            double y=filter2(resultat);
            resultat+=y*resultat;
        }
        return resultat;
    }

    protected abstract double filter2(double d);

    protected abstract double filter1(String str);
}
