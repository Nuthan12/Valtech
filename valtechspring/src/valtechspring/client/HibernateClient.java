package valtechspring.client;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
//import org.hibernate.cfg.Configuration;

import valtechspring.orm.Account;
import valtechspring.orm.Address;
import valtechspring.orm.AtmTx;
import valtechspring.orm.BankAccount;
import valtechspring.orm.BankAccountId;
//import valtechspring.orm.BankAccountId;
import valtechspring.orm.Car;
import valtechspring.orm.ChequeTx;
import valtechspring.orm.Customer;
import valtechspring.orm.TellerTx;
import valtechspring.orm.Tx;
import valtechspring.orm.dao.CustomerDAO;
import valtechspring.orm.dao.CustomerDAOImpl;

public class HibernateClient {

	public static void main(String[] args) {
//		SessionFactory sf=new Configuration()
		SessionFactory sf= new AnnotationConfiguration()
				.configure()
//				.addClass(Car.class)
				.addAnnotatedClass(Car.class)
				.addAnnotatedClass(BankAccount.class)
				.addAnnotatedClass(Tx.class).addAnnotatedClass(TellerTx.class)
				.addAnnotatedClass(AtmTx.class).addAnnotatedClass(ChequeTx.class)
				.addAnnotatedClass(Customer.class).addAnnotatedClass(Address.class)
				
				.addAnnotatedClass(Account.class)
				.buildSessionFactory();
		
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		
		
//		Customer c=new Customer("Nuthan",new Date(74,10,05),1);
//		Address a=new Address("Simon Street","JP Nagar","Karnataka",560078);
//		ses.save(c);
//		ses.save(a);
//		c.setAddress(a);
//		a.setCustomer(c);
		CustomerDAO customerDAO = new CustomerDAOImpl();
		
//		System.out.println("Combined Balance c1 = "+customerDAO.getCombinedBalance(ses, 1));
//		
//		List objects =ses.createQuery("SELECT o FROM java.lang.Object o").list();
//		for(Object o :objects){
//			System.out.println(o);
//		}
		
//		
//		for(Customer c:customerDAO.getByAccountBalanceGreaterThan(ses, 10000)){
//			System.out.println(c);
//		}
//		
//		for(Customer c:customerDAO.getByTransactionAmountGreaterThan(ses, 2000)){
//			System.out.println(c);
//		}

//		for(Customer c:customerDAO.getByState(ses, "Karnataka")){
//			System.out.println(c);
//		}
		
//		Customer c=new Customer("Nuthan",new Date(74,10,05),1);
//		Address a=new Address("Simon Street","JP Nagar","Karnataka",560078);
//		
//		ses.save(c);
//		ses.save(a);
//		c.setAddress(a);
//		
//		Customer c1=(Customer)ses.load(Customer.class, 10);
//		
//		
//		
		
		Account account =new Account(1000,"SB");
		Account account1=new Account(100000,"CA");
		
		
		ses.save(account);
		ses.save(account1);
		
		for(Customer c:customerDAO.getByAccountType(ses, "SB") ){
			System.out.println(c);
		}
//		
//		Account account2=(Account)ses.load(Account.class, 31);
//		System.out.println("Account 2"+account2.getId());
//		Account account3=(Account) ses.load(Account.class, 30);
//		System.out.println("Account 3"+account3.getId());
//		
//		c.addAccount(account);
//		c.addAccount(account3);
//		c.addAccount(account2);
//////		
////		
//		c1.addAccount(account3);
//		c1.addAccount(account1);
//		ses.save(new Tx(1000));
//		ses.save(new ChequeTx(2000,123456,false,2));
//		ses.save(new TellerTx(2500,"Teller1","Jp Nagar"));
//		ses.save(new AtmTx(3000 ,123,"Jayanagar"));
////		
//		
//		List<Tx> txs=ses.createQuery("Select tx from Tx tx").list();
//		for(Tx t:txs){
//			//Ternary Operator boolCond ? true:false
//			t.setAccount(t.getId()%2==0?account:account1);
//		}
//		
////		Customer c=new Customer("Nuthan",new Date(74,10,05),1);
//		Address a=new Address("Simon Street","JP Nagar","Karnataka",560078);
//		
//		ses.save(a);
//		ses.save(c);
//		a.setCustomer(c);
//		c.setAddress(a);
		
//		ses.save(new Tx(1000));
//		ses.save(new ChequeTx(2000,123456,false,2));
//		ses.save(new TellerTx(2500,"Teller1","Jp Nagar"));
//		ses.save(new AtmTx(3000 ,123,"Jayanagar"));
//		
//		List<Tx> txs=ses.createQuery("SELECT t FROM Tx t").list();
//		for(Tx t:txs){
//			System.out.println(t);
//		}
		
		
//		BankAccount bankAccount=(BankAccount) ses.load(BankAccount.class, new BankAccountId(1,"SB"));
//		System.out.println(bankAccount);
		
//		BankAccount ba=new BankAccount();
//		ba.setAccountNo(1);
//		ba.setAccountType("SB");
//		ba.setActive(true);
//		ba.setBalance(1000);
//		ba.setOpeningDate(new Date());
//		ses.save(ba);
//		
//		Car car=new Car("Bugatti","Butta",2022,150000000,"Green",new CarDetails(25000,true,1));
//		ses.save(car);
		
		
//		Car car=(Car) ses.load(Car.class, 10);
//		System.out.println("Car Loaded " + car.getClass().getName());
//		System.out.println(car.getMake());
//		car.setPrice(2400000);
//		ses.update(car);
//		System.out.println("Car Saved");
		tx.commit();
		ses.close();
		sf.close();
	}

}
