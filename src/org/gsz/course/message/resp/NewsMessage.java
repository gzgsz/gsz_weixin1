/**
 * 
 */
package org.gsz.course.message.resp;

import java.util.List;

/**
 *�ı���Ϣ
 *
 * @author gongsizhen
 * @author 2014��3��20��
 *
 */
public class NewsMessage extends BaseMessage {
	//ͼ����Ϣ����������Ϊ10������  
	private int ArticleCount;
	
	//����ͼ����Ϣ��Ϣ��Ĭ�ϵ�һ��itemΪ��ͼ 
	private List<Article> Articles;

	/**
	 * @return the articleCount
	 */
	public int getArticleCount() {
		return ArticleCount;
	}

	/**
	 * @param articleCount the articleCount to set
	 */
	public void setArticleCount(int articleCount) {
		ArticleCount = articleCount;
	}

	/**
	 * @return the articles
	 */
	public List<Article> getArticles() {
		return Articles;
	}

	/**
	 * @param articles the articles to set
	 */
	public void setArticles(List<Article> articles) {
		Articles = articles;
	}
	
	
	
}
