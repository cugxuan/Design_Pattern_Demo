public class CoderProxy implements ICoder {
    private ICoder coder;

    public CoderProxy(ICoder coder){
        this.coder = coder;
    }

    @Override
    public void implDemands(String demandName) {
        coder.implDemands(demandName);
    }
}
