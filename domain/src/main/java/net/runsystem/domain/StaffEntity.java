package net.runsystem.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Description:
 *
 * @author: GMO_ThanhND
 * @version: 1.0
 * @since 3/23/2022 11:18 AM
 */
@Entity
@Data
@Table(name = "staff", schema = "poly_techcam", catalog = "")
public class StaffEntity {
 @Id
 @Column(name = "ID")
 private String id;
 @Basic
 @Column(name = "FULL_NAME")
 private String fullName;
 @Basic
 @Column(name = "PHONE_NUMBER")
 private String phoneNumber;
 @Basic
 @Column(name = "EMAIL")
 private String email;
 @Basic
 @Column(name = "ADDRESS")
 private String address;
 @Basic
 @Column(name = "DATE_OF_BIRTH")
 private Date dateOfBirth;
 @Basic
 @Column(name = "STAFF_CODE")
 private int staffCode;
 @Basic
 @Column(name = "IDENTITY_NUMBER")
 private String identityNumber;
 @Basic
 @Column(name = "AVATAR")
 private String avatar;
 @Basic
 @Column(name = "ROLE")
 private String role;
 @Basic
 @Column(name = "USERNAME")
 private String username;
 @Basic
 @Column(name = "PASSWORD")
 private String password;
 @Basic
 @Column(name = "COUNT_LOGIN_FALSE")
 private int countLoginFalse;
 @Basic
 @Column(name = "STATUS")
 private String status;
 @Basic
 @Column(name = "NOTE")
 private String note;

}
