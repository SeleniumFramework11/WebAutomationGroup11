package homepage;

public class AddressOfPatient extends InsuranceInformationPage {
    public String enterCustomerAddress(){
        enterCustomerDOB();
        typeByCss("#street","17527 wexford road");
        typeByCss("#apt","7B");
        clickNext();
        return driver.getTitle();
    }


}