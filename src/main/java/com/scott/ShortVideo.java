package com.scott;

import java.util.Arrays;

/**
 * 短视频
 */
public class ShortVideo {

    private Long videoId; // 视频编号

    private String title; // 标题

    private String briefIntroduction; // 简介

    private String []topics; // 话题

    private String coverUrl; // 封面

    private String videoUrl; // 视频链接

    private Boolean mountMiniApp; // 是否挂载了小程序

    private String miniAppUrl; // 小程序链接

    public Long getVideoId() {
        return videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBriefIntroduction() {
        return briefIntroduction;
    }

    public void setBriefIntroduction(String briefIntroduction) {
        this.briefIntroduction = briefIntroduction;
    }

    public String[] getTopics() {
        return topics;
    }

    public void setTopics(String[] topics) {
        this.topics = topics;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Boolean getMountMiniApp() {
        return mountMiniApp;
    }

    public void setMountMiniApp(Boolean mountMiniApp) {
        this.mountMiniApp = mountMiniApp;
    }

    public String getMiniAppUrl() {
        return miniAppUrl;
    }

    public void setMiniAppUrl(String miniAppUrl) {
        this.miniAppUrl = miniAppUrl;
    }

    @Override
    public String toString() {
        return "ShortVideo{" +
                "videoId=" + videoId +
                ", title='" + title + '\'' +
                ", briefIntroduction='" + briefIntroduction + '\'' +
                ", topics=" + Arrays.toString(topics) +
                ", coverUrl='" + coverUrl + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", mountMiniApp=" + mountMiniApp +
                ", miniAppUrl='" + miniAppUrl + '\'' +
                '}';
    }
}
