package com.provisa.dao;

import com.provisa.commons.utils.CommonUtils;
import com.provisa.consts.CITY;
import com.provisa.dao.converter.CITYAttributeConverter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="operator")
public class Operator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String operatorName;

    @Column
    private String operatorLogin;

    @Column
    @Convert(converter = CITYAttributeConverter.class)
    private CITY operatorCity;

    @Column
    private String user;

    @Column
    private Integer botId;

    @Column
    private String phone;

    @Column
    private Integer simId;

    @Column
    private LocalDateTime activated;

    @Column
    private Integer accountId;

    @Column
    private LocalDateTime selected;

    @Column
    private Integer checking;

    @Column
    private boolean clear;

    @Column
    private boolean visible;

    @Column
    private String personalChatId;

    @Column
    private String groupChatId;

    @Column(nullable = false)
    private boolean groupNotificationsEnabled = false;

    @Column(nullable = false)
    private boolean personalNotificationsEnabled = false;

    public String toString() {
        return CommonUtils.capitalize(this.operatorName);
    }

    public Operator(Integer id) {
        this.id = id;
    }
}