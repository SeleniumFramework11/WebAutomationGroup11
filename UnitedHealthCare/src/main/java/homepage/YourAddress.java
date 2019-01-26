package homepage;

import static base.BaseUtil.driver;

public class YourAddress extends YourInfoPage{
    public String enterCustomerAddress(){
        enterCustomerDOB();
        typeByCss("#street","17527 wexford road");
        typeByCss("#apt","7B");
        clickNext();
        return driver.getTitle();
    }


}