package model;

import java.util.ArrayList;

//import fr.insa.soa.rest.RestTD.Link;
//import fr.insa.soa.rest.RestTD.Mission;
//
//@XmlRootElement(name="User")
public class User {
	private String pseudo;
	private String mdp;
	private int id;
	private int type;
//	private ArrayList<Mission> missions=new ArrayList<Mission>() ;
//	private ArrayList<Link> links=new ArrayList<Link>();
//	
 
//	public User (String pseudo, int id, String mdp,int type, ArrayList<Mission> missions) {
//		super();
//		this.id=id;
//		this.pseudo=pseudo;
//		this.type=type;
//		this.missions=missions;
//		this.mdp=mdp;
//	}
	
	public int getid() {
		return id;
	}
	
	public void setmdp(String mdp) {
		this.mdp=mdp;
	}
	public String getmdp() {
		return mdp;
	}
	
	public void setid(int id) {
		this.id=id;
	}
	
	public int gettype() {
		return type;
	}
	
	public void settype(int type) {
		this.type=type;
	}
	
	public String getpseudo() {
		return pseudo;
	}
	
	public void setpseudo(String pseudo) {
		this.pseudo=pseudo;
	}
	
//	public void setMission(String text, String status) {
//		Mission miss=new Mission();
//		miss.settext(text);
//		miss.setstatus(status);
//		missions.add(miss);
//	}
//	
//	public void setMission(Mission miss) {
//		missions.add(miss);
//	}
//	
//	public ArrayList<Mission> getMissions(){
//		return missions;
//	}
//	
//	public void addLink(String uri, String rel, String methode) {
//		Link newlink=new Link();
//		newlink.setUri(uri);
//		newlink.setRel(rel);
//		newlink.setMeth(methode);
//		links.add(newlink);
//	}
//	
//	public ArrayList<Link> getLinks(){
//		return links;
//	}
//	//public String getpseudoByid(int id)
//
}

