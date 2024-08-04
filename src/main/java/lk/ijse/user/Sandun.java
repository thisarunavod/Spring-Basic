package lk.ijse.user;

import jakarta.annotation.PostConstruct;
import lk.ijse.dep.GoodGirl;
import lk.ijse.dep.Wow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Sandun {

    //-----------------Field Injection---------------------------------------------------------
    /*@Autowired // <----  dependencu injection wladi use karanawa . runtime ekedi dependency ekak inject karaganna kiyala kiyanne
    @Qualifier("Long hair")
    @Wow
    private GoodGirl goodGirl;*/


    //---------------- contructor Injection ---------------------------------------------------

    /*@Qualifier
    private final GoodGirl goodGirl;
    @Autowired
    @Wow
    public Sandun(GoodGirl goodGirl) {
        this.goodGirl = goodGirl;
    }*/

    //---------------- Setter Injection ---------------------------------------------------

    @Qualifier
    private GoodGirl goodGirl;
    @Autowired
    @Wow
    public void setGodGirl(GoodGirl goodGirl) {
        this.goodGirl = goodGirl;
    }


    @PostConstruct  /*<------ meka spring anootation ekak nemey . runtime eke tmy blanne */
    public void init(){
        //System.out.println(goodGirl);
        goodGirl.love();
    }


}
