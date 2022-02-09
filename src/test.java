import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Address;
import entity.Member;
import entity.MemberType;
import entity.Degree;
public class test {
	public static void main(String []args){
		Address addr =new Address();
		addr.setAddress("esfahan-kerman");
		addr.setNumber("0901327");
		addr.setZipcode("818-264-121");
		
		
		System.out.println("this is one");
		Member m = new Member();
		
		m.setAddress(addr);
		
		MemberType mt = new MemberType();
		mt.setTypename("student");
		mt.getMembers().add(m);
		
		m.setType(mt);
		
		Degree d1= new Degree();
		d1.setTitle("bachelor");
		
		Degree d2= new Degree();
		d2.setTitle("master");
		
		m.getDegree().add(d1);
		m.getDegree().add(d2);
		
		d1.getMember().add(m);
		d1.getMember().add(m);
		
		System.out.println("this is two");
//		m.setId(7);
		System.out.println("this is three");
		m.setName( "ali");
		m.setFamily("karimii");
		System.out.println("this is four");
		SessionFactory sf= new Configuration().configure("/config/hibernate.cfg.xml").buildSessionFactory();
		System.out.println("this is five");
		Session session = sf.openSession();
		System.out.println("this is six");
		Transaction tx = session.beginTransaction();
		System.out.println("this is seven");
		session.save(m);///save into db
		session.save(addr);
		session.save(mt); 
		session.save(d1);
		session.save(d2);
		tx.commit();
		session.close();
		
		
	}
}
