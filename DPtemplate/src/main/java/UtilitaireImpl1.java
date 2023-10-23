public class UtilitaireImpl1 extends Utilitaire {
    @Override
    protected double filter2(double d) {
        return d*2 ;
    }

    @Override
    protected double filter1(String str) {
        return Math.pow(str.length(),4);
    }
}
