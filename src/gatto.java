public class gatto extends animale{

    private String verso="miagolare";
    gatto(String miagolare){
        super(miagolare);
        this.verso="miagolare";
    }
    public void faIlVerso() {
        System.out.println("il verso del gatto è "+ verso);
    }
}
