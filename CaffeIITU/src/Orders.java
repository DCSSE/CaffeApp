import java.io.Serializable;
import java.util.ArrayList;

public class Orders implements Serializable {
    private String salad;
    private String soup;
    private String secmeal;
    private String sidedish;

    private Integer saladnum;
    private Integer soupnum;
    private Integer secmealnum;
    private Integer sidedishnum;

    private Integer pancake;
    private Integer cheesecake;
    private Integer applepie;
    private Integer croissants;
    private Integer bliniwsyru;

    private Integer blacktea;
    private Integer greentea;
    private Integer coffee;
    private Integer limonade;
    private Integer coke;
    private Integer water;
    private Integer milkshake;

    private String nameclient;
    private int orderid;

    public Orders() {
    }

    public Orders(String salad, String soup, String secmeal, String sidedish,
                  Integer saladnum, Integer soupnum, Integer secmealnum, Integer sidedishnum, Integer pancake,
                  Integer cheesecake, Integer applepie, Integer croissants, Integer bliniwsyru, Integer blacktea,
                  Integer greentea, Integer coffee, Integer limonade, Integer coke, Integer water,
                  Integer milkshake, String nameclient, Integer orderid) {
        this.salad = salad;
        this.soup = soup;
        this.secmeal = secmeal;
        this.sidedish = sidedish;
        this.saladnum = saladnum;
        this.soupnum = soupnum;
        this.secmealnum = secmealnum;
        this.sidedishnum = sidedishnum;
        this.pancake = pancake;
        this.cheesecake = cheesecake;
        this.applepie = applepie;
        this.croissants = croissants;
        this.bliniwsyru = bliniwsyru;
        this.blacktea = blacktea;
        this.greentea = greentea;
        this.coffee = coffee;
        this.limonade = limonade;
        this.coke = coke;
        this.water = water;
        this.milkshake = milkshake;
        this.nameclient = nameclient;
        this.orderid = orderid;
    }

    public String getSalad() {
        return salad;
    }

    public void setSalad(String salad) {
        this.salad = salad;
    }

    public String getSoup() {
        return soup;
    }

    public void setSoup(String soup) {
        this.soup = soup;
    }

    public String getSecmeal() {
        return secmeal;
    }

    public void setSecmeal(String secmeal) {
        this.secmeal = secmeal;
    }

    public String getSidedish() {
        return sidedish;
    }

    public void setSidedish(String sidedish) {
        this.sidedish = sidedish;
    }

    public Integer getSaladnum() {
        return saladnum;
    }

    public void setSaladnum(Integer saladnum) {
        this.saladnum = saladnum;
    }

    public Integer getSoupnum() {
        return soupnum;
    }

    public void setSoupnum(Integer soupnum) {
        this.soupnum = soupnum;
    }

    public Integer getSecmealnum() {
        return secmealnum;
    }

    public void setSecmealnum(Integer secmealnum) {
        this.secmealnum = secmealnum;
    }

    public Integer getSidedishnum() {
        return sidedishnum;
    }

    public void setSidedishnum(Integer sidedishnum) {
        this.sidedishnum = sidedishnum;
    }

    public Integer getPancake() {
        return pancake;
    }

    public void setPancake(Integer pancake) {
        this.pancake = pancake;
    }

    public Integer getCheesecake() {
        return cheesecake;
    }

    public void setCheesecake(Integer cheesecake) {
        this.cheesecake = cheesecake;
    }

    public Integer getApplepie() {
        return applepie;
    }

    public void setApplepie(Integer applepie) {
        this.applepie = applepie;
    }

    public Integer getCroissants() {
        return croissants;
    }

    public void setCroissants(Integer croissants) {
        this.croissants = croissants;
    }

    public Integer getBliniwsyru() {
        return bliniwsyru;
    }

    public void setBliniwsyru(Integer bliniwsyru) {
        this.bliniwsyru = bliniwsyru;
    }

    public Integer getBlacktea() {
        return blacktea;
    }

    public void setBlacktea(Integer blacktea) {
        this.blacktea = blacktea;
    }

    public Integer getGreentea() {
        return greentea;
    }

    public void setGreentea(Integer greentea) {
        this.greentea = greentea;
    }

    public Integer getCoffee() {
        return coffee;
    }

    public void setCoffee(Integer coffee) {
        this.coffee = coffee;
    }

    public Integer getLimonade() {
        return limonade;
    }

    public void setLimonade(Integer limonade) {
        this.limonade = limonade;
    }

    public Integer getCoke() {
        return coke;
    }

    public void setCoke(Integer coke) {
        this.coke = coke;
    }

    public Integer getWater() {
        return water;
    }

    public void setWater(Integer water) {
        this.water = water;
    }

    public Integer getMilkshake() {
        return milkshake;
    }

    public void setMilkshake(Integer milkshake) {
        this.milkshake = milkshake;
    }

    public String getNameclient() {
        return nameclient;
    }

    public void setNameclient(String nameclient) {
        this.nameclient = nameclient;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String ToString() {
        return salad + " - " + saladnum + ", " + soup + " - " + soupnum + ", " + secmeal + " - " + secmealnum + ", "
                + sidedish + " - " + sidedishnum + ", " + pancake + ", " + cheesecake + ", "
                + applepie + ", " + croissants + ", " + bliniwsyru + ", " + blacktea + ", " + greentea + ", "
                + coffee + ", " + limonade + ", " + coke + ", " + water + ", " + milkshake + ", " + nameclient + ", "
                + orderid;
    }

}
