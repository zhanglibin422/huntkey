package com.huntkey.rx.sceo.common.service.common.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.huntkey.rx.sceo.common.service.common.model.to.SimpleEmailTO;

public class EmailLogWithBLOBs extends EmailLog {
	public EmailLogWithBLOBs(SimpleEmailTO to){
		try {
			this.setAddtime(Calendar.getInstance().getTime());
			this.setAdduser(to.getAddUser());
			this.mailcontent=to.getMailContent();
			this.mailrecipient=to.getMailRecipient();
			this.mailcopyrecipient=to.getMailCopyRecipient();
			this.setMailmodulecode(to.getMailModuleCode());
			this.setMailsubject(to.getMailSubject());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LOG_SEND_EMAIL.mailContent
     *
     * @mbg.generated Fri Jun 23 09:55:13 CST 2017
     */
    private String mailcontent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LOG_SEND_EMAIL.mailRecipient
     *
     * @mbg.generated Fri Jun 23 09:55:13 CST 2017
     */
    private String mailrecipient;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LOG_SEND_EMAIL.mailCopyRecipient
     *
     * @mbg.generated Fri Jun 23 09:55:13 CST 2017
     */
    private String mailcopyrecipient;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LOG_SEND_EMAIL.mailContent
     *
     * @return the value of LOG_SEND_EMAIL.mailContent
     *
     * @mbg.generated Fri Jun 23 09:55:13 CST 2017
     */
    public String getMailcontent() {
        return mailcontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LOG_SEND_EMAIL.mailContent
     *
     * @param mailcontent the value for LOG_SEND_EMAIL.mailContent
     *
     * @mbg.generated Fri Jun 23 09:55:13 CST 2017
     */
    public void setMailcontent(String mailcontent) {
        this.mailcontent = mailcontent == null ? null : mailcontent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LOG_SEND_EMAIL.mailRecipient
     *
     * @return the value of LOG_SEND_EMAIL.mailRecipient
     *
     * @mbg.generated Fri Jun 23 09:55:13 CST 2017
     */
    public String getMailrecipient() {
        return mailrecipient;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LOG_SEND_EMAIL.mailRecipient
     *
     * @param mailrecipient the value for LOG_SEND_EMAIL.mailRecipient
     *
     * @mbg.generated Fri Jun 23 09:55:13 CST 2017
     */
    public void setMailrecipient(String mailrecipient) {
        this.mailrecipient = mailrecipient == null ? null : mailrecipient.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LOG_SEND_EMAIL.mailCopyRecipient
     *
     * @return the value of LOG_SEND_EMAIL.mailCopyRecipient
     *
     * @mbg.generated Fri Jun 23 09:55:13 CST 2017
     */
    public String getMailcopyrecipient() {
        return mailcopyrecipient;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LOG_SEND_EMAIL.mailCopyRecipient
     *
     * @param mailcopyrecipient the value for LOG_SEND_EMAIL.mailCopyRecipient
     *
     * @mbg.generated Fri Jun 23 09:55:13 CST 2017
     */
    public void setMailcopyrecipient(String mailcopyrecipient) {
        this.mailcopyrecipient = mailcopyrecipient == null ? null : mailcopyrecipient.trim();
    }
}