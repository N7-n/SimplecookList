package main;

public class DTO {
	private int id;
    private String title;
    private String text;
    private String item;
	private int time;


    public DTO() {

    }
    public DTO(int id,String title, String text, String item,int time) {
        this.id = id;
    	this.title = title;
        this.text = text;
        this.item = item;
        this.time = time;
    }

    //IDのゲッター、セッター
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //タイトルのゲッター、セッター
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    //テキストのゲッター、セッター
    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }

    //アイテムのゲッター、セッター
    public void setItem(String item) {
        this.item = item;
    }
    public String getItem() {
        return item;
    }

    //タイムのゲッター、セッター
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }
}
