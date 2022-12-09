package bookhouse.client;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import bookhouse.orm.Article;
import bookhouse.orm.Author;
import bookhouse.orm.AuthorAddress;
import bookhouse.orm.Blog;
import bookhouse.orm.Book;
import bookhouse.orm.HardBind;
import bookhouse.orm.Publisher;

public class HibernateClient {
	public static void main(String[] args) {
		SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(Book.class).addAnnotatedClass(AuthorAddress.class).addAnnotatedClass(Article.class).addAnnotatedClass(Author.class).addAnnotatedClass(Blog.class).addAnnotatedClass(HardBind.class).addAnnotatedClass(Publisher.class).buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		
//	Book b=new Book("Wings Of Fire","1st",150,new Date(102,5,12));
//	ses.save(b);
//	Publisher p =  new Publisher(1,"Sapna", "Bengaluru",8065646252L);
//	
//	ses.save(p);
//	b.setPublisher(p);
//	ses.save(b);
	
	Article a1= new Article("abc.exam.com","nuthansml");
	ses.save(a1);
	Author a=new Author("Abdul Kalam",15424884L);
	ses.save(a);
	AuthorAddress a11=new AuthorAddress(50,"Rameshwaram", "Tamil Nadu", 564584L);
	ses.save(a11);
	a.setAuthoraddress(a11);
	a11.setAuthor(a);
	Blog b1=new Blog("First Book", "firstbook@wingsOfFire.com", 2L);
	ses.save(b1);
	HardBind hb1=new HardBind(1, 200, "2006", 1);
	ses.save(hb1);
	
	tx.commit();
	ses.close();
	sf.close();
	}

}
