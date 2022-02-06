package vo;

public class HomeVo {
	
	public int serial;
	public int videoOrder;
	public String videoMaker;
	public String videoType;
	public String uploadDate;
	public String videoName;
	public String videoTitle;
	public int bannerVideo;
	
	
	
	
	public int getBannerVideo() {
		return bannerVideo;
	}
	public void setBannerVideo(int bannerVideo) {
		this.bannerVideo = bannerVideo;
	}
	public String getVideoTitle() {
		return videoTitle;
	}
	public void setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
	}
	public String getVideoName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial = serial;
	}
	public int getVideoOrder() {
		return videoOrder;
	}
	public void setVideoOrder(int videoOrder) {
		this.videoOrder = videoOrder;
	}
	public String getVideoMaker() {
		return videoMaker;
	}
	public void setVideoMaker(String videoMaker) {
		this.videoMaker = videoMaker;
	}
	public String getVideoType() {
		return videoType;
	}
	public void setVideoType(String videoType) {
		this.videoType = videoType;
	}
	public String getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(String uploadDate) {
		this.uploadDate = uploadDate;
	}
}
