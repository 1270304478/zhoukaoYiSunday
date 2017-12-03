package retrofit.bwei.com.zhoukaoyisunday.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;


/**
 * 此类的作用：
 *
 * @author: forever
 * @date: 2017/12/3 14:10
 */
@Entity
public class DataBean {
    /**
     * bargainPrice : 111.99
     * createtime : 2017-10-14T21:39:05
     * detailUrl : https://item.m.jd.com/product/4719303.html?utm_source=androidapp&utm_medium=appshare&utm_campaign=t_335139774&utm_term=QQfriends
     * images : https://m.360buyimg.com/n0/jfs/t9004/210/1160833155/647627/ad6be059/59b4f4e1N9a2b1532.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t7504/338/63721388/491286/f5957f53/598e95f1N7f2adb87.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t7441/10/64242474/419246/adb30a7d/598e95fbNd989ba0a.jpg!q70.jpg
     * itemtype : 1
     * pid : 1
     * price : 118.0
     * pscid : 1
     * salenum : 0
     * sellerid : 17
     * subhead : 每个中秋都不能简单，无论身在何处，你总需要一块饼让生活更圆满，京东月饼让爱更圆满京东自营，闪电配送，更多惊喜，快用手指戳一下
     * title : 北京稻香村 稻香村中秋节月饼 老北京月饼礼盒655g
     */
    @Id(autoincrement = true)
   private  Long id;
    private double bargainPrice;
    private String createtime;
    private String detailUrl;
    private String images;
    private int itemtype;
    private int pid;
    private double price;
    private int pscid;
    private int salenum;
    private int sellerid;
    private String subhead;
    private String title;

    public double getBargainPrice() {
        return bargainPrice;
    }

    public void setBargainPrice(double bargainPrice) {
        this.bargainPrice = bargainPrice;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public int getItemtype() {
        return itemtype;
    }

    public void setItemtype(int itemtype) {
        this.itemtype = itemtype;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPscid() {
        return pscid;
    }

    public void setPscid(int pscid) {
        this.pscid = pscid;
    }

    public int getSalenum() {
        return salenum;
    }

    public void setSalenum(int salenum) {
        this.salenum = salenum;
    }

    public int getSellerid() {
        return sellerid;
    }

    public void setSellerid(int sellerid) {
        this.sellerid = sellerid;
    }

    public String getSubhead() {
        return subhead;
    }

    public void setSubhead(String subhead) {
        this.subhead = subhead;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DataBean() {

    }

    @Generated(hash = 1502893708)
    public DataBean(Long id, double bargainPrice, String createtime, String detailUrl, String images, int itemtype, int pid, double price, int pscid, int salenum, int sellerid, String subhead, String title) {
        this.id = id;
        this.bargainPrice = bargainPrice;
        this.createtime = createtime;
        this.detailUrl = detailUrl;
        this.images = images;
        this.itemtype = itemtype;
        this.pid = pid;
        this.price = price;
        this.pscid = pscid;
        this.salenum = salenum;
        this.sellerid = sellerid;
        this.subhead = subhead;
        this.title = title;
    }

    @Override
    public String toString() {
        return "DataBean{" +
                "id=" + id +
                ", bargainPrice=" + bargainPrice +
                ", createtime='" + createtime + '\'' +
                ", detailUrl='" + detailUrl + '\'' +
                ", images='" + images + '\'' +
                ", itemtype=" + itemtype +
                ", pid=" + pid +
                ", price=" + price +
                ", pscid=" + pscid +
                ", salenum=" + salenum +
                ", sellerid=" + sellerid +
                ", subhead='" + subhead + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
