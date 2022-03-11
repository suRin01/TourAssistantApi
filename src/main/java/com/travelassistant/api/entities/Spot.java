package com.travelassistant.api.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "spots")
public class Spot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "spotIdx", nullable = false)
    private Integer id;

    @Column(name = "addr1", length = 400)
    private String addr1;

    @Column(name = "addr2", length = 400)
    private String addr2;

    @Column(name = "areacode", length = 10)
    private String areacode;

    @Column(name = "cat1", length = 12)
    private String cat1;

    @Column(name = "cat2", length = 12)
    private String cat2;

    @Column(name = "cat3", length = 12)
    private String cat3;

    @Column(name = "contentid", length = 12)
    private String contentid;

    @Column(name = "contenttypeid", length = 2)
    private String contenttypeid;

    @Column(name = "createdtime", length = 14)
    private String createdtime;

    @Column(name = "firstimage", length = 300)
    private String firstimage;

    @Column(name = "firstimage2", length = 300)
    private String firstimage2;

    @Column(name = "mapx")
    private Double mapx;

    @Column(name = "mapy")
    private Double mapy;

    @Column(name = "mlevel", length = 1)
    private String mlevel;

    @Column(name = "modifiedtime", length = 14)
    private String modifiedtime;

    @Column(name = "readcount", length = 20)
    private String readcount;

    @Column(name = "sigungucode", length = 20)
    private String sigungucode;

    @Column(name = "tel", length = 300)
    private String tel;

    @Column(name = "title", length = 600)
    private String title;

    @Column(name = "zipcode", length = 10)
    private String zipcode;

    @Builder
    public Spot( Integer id, String addr1, String addr2, String areacode, String cat1, String cat2, String cat3, String contentid, String contenttypeid, String createdtime, String firstimage, String firstimage2, Double mapx, Double mapy, String mlevel, String modifiedtime, String readcount, String sigungucode, String tel, String title, String zipcode ) {
        this.id = id;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.areacode = areacode;
        this.cat1 = cat1;
        this.cat2 = cat2;
        this.cat3 = cat3;
        this.contentid = contentid;
        this.contenttypeid = contenttypeid;
        this.createdtime = createdtime;
        this.firstimage = firstimage;
        this.firstimage2 = firstimage2;
        this.mapx = mapx;
        this.mapy = mapy;
        this.mlevel = mlevel;
        this.modifiedtime = modifiedtime;
        this.readcount = readcount;
        this.sigungucode = sigungucode;
        this.tel = tel;
        this.title = title;
        this.zipcode = zipcode;
    }


}