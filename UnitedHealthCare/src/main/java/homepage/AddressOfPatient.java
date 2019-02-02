package homepage;

public class AddressOfPatient extends InsuranceInformationPage {
    public String enterCustomerAddress(){
        enterPatientDOB();
        typeByCss("#street","34-64 60th street");
        typeByCss("#apt","1");
        clickNext();
        return driver.getTitle();
    }


}