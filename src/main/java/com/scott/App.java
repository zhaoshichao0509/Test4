package com.scott;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ShortVideo shortVideo = new ShortVideo();
        shortVideo.setVideoId(1L);
        shortVideo.setTitle("《斗罗大陆2》唐三小舞");
        shortVideo.setVideoUrl("https://www.baidu.com");
        shortVideo.setBriefIntroduction("国漫巅峰之作，评分超高");
        String topics[] = new String[]{"#斗罗大陆","#斗罗大陆唐三小舞"};
        shortVideo.setTopics(topics);
        shortVideo.setMountMiniApp(Boolean.FALSE);
        System.out.println(shortVideo);
    }
}
