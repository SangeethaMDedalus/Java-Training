package com.dal.firstsprboot.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "atbl_local")
public class LocalTour {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long localid;
	
	@Column(nullable = false)
	private String location;
	
	@Column(nullable = false)
	private long noofpeople;	

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="travellercode", referencedColumnName="travellerId")
	private Traveller trtourist;

	public LocalTour(Long localid, String location, long noofpeople, Traveller trtourist) {
		super();
		this.localid = localid;
		this.location = location;
		this.noofpeople = noofpeople;
		this.trtourist = trtourist;
	}

	public Long getLocalid() {
		return localid;
	}

	public void setLocalid(Long localid) {
		this.localid = localid;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getNoofpeople() {
		return noofpeople;
	}

	public LocalTour() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setNoofpeople(long noofpeople) {
		this.noofpeople = noofpeople;
	}

	public Traveller getTrtourist() {
		return trtourist;
	}

	public void setTrtourist(Traveller trtourist) {
		this.trtourist = trtourist;
	}

	@Override
	public String toString() {
		return "LocalTour [localid=" + localid + ", location=" + location + ", noofpeople=" + noofpeople
				+ ", trtourist=" + trtourist + "]";
	}
}
