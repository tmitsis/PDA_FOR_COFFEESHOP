
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Θοδωρης
 */
public class EPILOGES extends javax.swing.JFrame {
    
    
    
    public Connection con=null;
    
    public Connection dbConn(){
      
       String url="jdbc:postgresql://localhost:5432/postgres";
       String user = "postgres";
       String password = "postgres";
       
       
       try {
           Class.forName("org.postgresql.Driver");
       } catch (ClassNotFoundException classNotFoundException) {
            JOptionPane.showMessageDialog(null, classNotFoundException);
       }
       try{
       con = DriverManager.getConnection(url,user,password);
       JOptionPane.showMessageDialog(null, "Connected");
       }catch(SQLException sQLException){
           JOptionPane.showMessageDialog(null, sQLException);
       }
       return con;
   }
  
   
    public EPILOGES() {
      
        initComponents();
         dbConn();
         
         
    }
    public ArrayList<Data>dataList(){
        table="table1";
        ArrayList<Data>dataList = new ArrayList<>();
          String url="jdbc:postgresql://localhost:5432/postgres";
          String user = "postgres";
          String password = "postgres";
       
         
       try {           
           Class.forName("org.postgresql.Driver");
           
       con = DriverManager.getConnection(url,user,password);
       String query1="SELECT * FROM "+table;
       Statement st=con.createStatement();
       ResultSet rs =  st.executeQuery(query1);
       Data data;
       while(rs.next()){
           data=new Data(rs.getInt("posotita"),rs.getDouble("timi"),rs.getString("eidos"),rs.getString("sxolio"));
           dataList.add(data);
       }
       }
           catch (Exception ex){
         JOptionPane.showMessageDialog(null, ex);
           
       }
       return dataList;
    }
     public ArrayList<Data>dataList2(){
         table="table2";
        ArrayList<Data>dataList2 = new ArrayList<>();
          String url="jdbc:postgresql://localhost:5432/postgres";
          String user = "postgres";
          String password = "postgres";
       
         
       try {           
           Class.forName("org.postgresql.Driver");
           
       con = DriverManager.getConnection(url,user,password);
       String query1="SELECT * FROM "+table;
       Statement st=con.createStatement();
       ResultSet rs =  st.executeQuery(query1);
       Data data;
       while(rs.next()){
           data=new Data(rs.getInt("posotita"),rs.getDouble("timi"),rs.getString("eidos"),rs.getString("sxolio"));
           dataList2.add(data);
       }
       }
           catch (Exception ex){
         JOptionPane.showMessageDialog(null, ex);
           
       }
       return dataList2;
    }
     public ArrayList<Data>dataList3(){
         table="table3";
        ArrayList<Data>dataList3 = new ArrayList<>();
          String url="jdbc:postgresql://localhost:5432/postgres";
          String user = "postgres";
          String password = "postgres";
       
         
       try {           
           Class.forName("org.postgresql.Driver");
           
       con = DriverManager.getConnection(url,user,password);
       String query1="SELECT * FROM "+table;
       Statement st=con.createStatement();
       ResultSet rs =  st.executeQuery(query1);
       Data data;
       while(rs.next()){
           data=new Data(rs.getInt("posotita"),rs.getDouble("timi"),rs.getString("eidos"),rs.getString("sxolio"));
           dataList3.add(data);
       }
       }
           catch (Exception ex){
         JOptionPane.showMessageDialog(null, ex);
           
       }
       return dataList3;
    }
     public ArrayList<Data>dataList4(){
         table="table4";
        ArrayList<Data>dataList4 = new ArrayList<>();
          String url="jdbc:postgresql://localhost:5432/postgres";
          String user = "postgres";
          String password = "postgres";
       
         
       try {           
           Class.forName("org.postgresql.Driver");
           
       con = DriverManager.getConnection(url,user,password);
       String query1="SELECT * FROM "+table;
       Statement st=con.createStatement();
       ResultSet rs =  st.executeQuery(query1);
       Data data;
       while(rs.next()){
           data=new Data(rs.getInt("posotita"),rs.getDouble("timi"),rs.getString("eidos"),rs.getString("sxolio"));
           dataList4.add(data);
       }
       }
           catch (Exception ex){
         JOptionPane.showMessageDialog(null, ex);
           
       }
       return dataList4;
    }
     public ArrayList<Data>dataList5(){
         table="table5";
        ArrayList<Data>dataList5 = new ArrayList<>();
          String url="jdbc:postgresql://localhost:5432/postgres";
          String user = "postgres";
          String password = "postgres";
       
         
       try {           
           Class.forName("org.postgresql.Driver");
           
       con = DriverManager.getConnection(url,user,password);
       String query1="SELECT * FROM "+table;
       Statement st=con.createStatement();
       ResultSet rs =  st.executeQuery(query1);
       Data data;
       while(rs.next()){
           data=new Data(rs.getInt("posotita"),rs.getDouble("timi"),rs.getString("eidos"),rs.getString("sxolio"));
           dataList5.add(data);
       }
       }
           catch (Exception ex){
         JOptionPane.showMessageDialog(null, ex);
           
       }
       return dataList5;
    }
     public ArrayList<Data>dataList6(){
         table="table6";
        ArrayList<Data>dataList6 = new ArrayList<>();
          String url="jdbc:postgresql://localhost:5432/postgres";
          String user = "postgres";
          String password = "postgres";
       
         
       try {           
           Class.forName("org.postgresql.Driver");
           
       con = DriverManager.getConnection(url,user,password);
       String query1="SELECT * FROM "+table;
       Statement st=con.createStatement();
       ResultSet rs =  st.executeQuery(query1);
       Data data;
       while(rs.next()){
           data=new Data(rs.getInt("posotita"),rs.getDouble("timi"),rs.getString("eidos"),rs.getString("sxolio"));
           dataList6.add(data);
       }
       }
           catch (Exception ex){
         JOptionPane.showMessageDialog(null, ex);
           
       }
       return dataList6;
    }
     public ArrayList<Data>dataList7(){
         table="table7";
        ArrayList<Data>dataList7 = new ArrayList<>();
          String url="jdbc:postgresql://localhost:5432/postgres";
          String user = "postgres";
          String password = "postgres";
       
         
       try {           
           Class.forName("org.postgresql.Driver");
           
       con = DriverManager.getConnection(url,user,password);
       String query1="SELECT * FROM "+table;
       Statement st=con.createStatement();
       ResultSet rs =  st.executeQuery(query1);
       Data data;
       while(rs.next()){
           data=new Data(rs.getInt("posotita"),rs.getDouble("timi"),rs.getString("eidos"),rs.getString("sxolio"));
           dataList7.add(data);
       }
       }
           catch (Exception ex){
         JOptionPane.showMessageDialog(null, ex);
           
       }
       return dataList7;
    }
     public ArrayList<Data>dataList8(){
         table="table8";
        ArrayList<Data>dataList8 = new ArrayList<>();
          String url="jdbc:postgresql://localhost:5432/postgres";
          String user = "postgres";
          String password = "postgres";
       
         
       try {           
           Class.forName("org.postgresql.Driver");
           
       con = DriverManager.getConnection(url,user,password);
       String query1="SELECT * FROM "+table;
       Statement st=con.createStatement();
       ResultSet rs =  st.executeQuery(query1);
       Data data;
       while(rs.next()){
           data=new Data(rs.getInt("posotita"),rs.getDouble("timi"),rs.getString("eidos"),rs.getString("sxolio"));
           dataList8.add(data);
       }
       }
           catch (Exception ex){
         JOptionPane.showMessageDialog(null, ex);
           
       }
       return dataList8;
    }
     public ArrayList<Data>dataList9(){
         table="table9";
        ArrayList<Data>dataList9 = new ArrayList<>();
          String url="jdbc:postgresql://localhost:5432/postgres";
          String user = "postgres";
          String password = "postgres";
       
         
       try {           
           Class.forName("org.postgresql.Driver");
           
       con = DriverManager.getConnection(url,user,password);
       String query1="SELECT * FROM "+table;
       Statement st=con.createStatement();
       ResultSet rs =  st.executeQuery(query1);
       Data data;
       while(rs.next()){
           data=new Data(rs.getInt("posotita"),rs.getDouble("timi"),rs.getString("eidos"),rs.getString("sxolio"));
           dataList9.add(data);
       }
       }
           catch (Exception ex){
         JOptionPane.showMessageDialog(null, ex);
           
       }
       return dataList9;
    }
     public ArrayList<Data>dataList10(){
         table="table10";
        ArrayList<Data>dataList10 = new ArrayList<>();
          String url="jdbc:postgresql://localhost:5432/postgres";
          String user = "postgres";
          String password = "postgres";
       
         
       try {           
           Class.forName("org.postgresql.Driver");
           
       con = DriverManager.getConnection(url,user,password);
       String query1="SELECT * FROM "+table;
       Statement st=con.createStatement();
       ResultSet rs =  st.executeQuery(query1);
       Data data;
       while(rs.next()){
           data=new Data(rs.getInt("posotita"),rs.getDouble("timi"),rs.getString("eidos"),rs.getString("sxolio"));
           dataList10.add(data);
       }
       }
           catch (Exception ex){
         JOptionPane.showMessageDialog(null, ex);
           
       }
       return dataList10;
    }
     public ArrayList<Data>dataList11(){
         table="table11";
        ArrayList<Data>dataList11 = new ArrayList<>();
          String url="jdbc:postgresql://localhost:5432/postgres";
          String user = "postgres";
          String password = "postgres";
       
         
       try {           
           Class.forName("org.postgresql.Driver");
           
       con = DriverManager.getConnection(url,user,password);
       String query1="SELECT * FROM "+table;
       Statement st=con.createStatement();
       ResultSet rs =  st.executeQuery(query1);
       Data data;
       while(rs.next()){
           data=new Data(rs.getInt("posotita"),rs.getDouble("timi"),rs.getString("eidos"),rs.getString("sxolio"));
           dataList11.add(data);
       }
       }
           catch (Exception ex){
         JOptionPane.showMessageDialog(null, ex);
           
       }
       return dataList11;
    }
     public ArrayList<Data>dataList12(){
         table="table12";
        ArrayList<Data>dataList12 = new ArrayList<>();
          String url="jdbc:postgresql://localhost:5432/postgres";
          String user = "postgres";
          String password = "postgres";
       
         
       try {           
           Class.forName("org.postgresql.Driver");
           
       con = DriverManager.getConnection(url,user,password);
       String query1="SELECT * FROM "+table;
       Statement st=con.createStatement();
       ResultSet rs =  st.executeQuery(query1);
       Data data;
       while(rs.next()){
           data=new Data(rs.getInt("posotita"),rs.getDouble("timi"),rs.getString("eidos"),rs.getString("sxolio"));
           dataList12.add(data);
       }
       }
           catch (Exception ex){
         JOptionPane.showMessageDialog(null, ex);
           
       }
       return dataList12;
    }
     public ArrayList<Data>dataList13(){
         table="table13";
        ArrayList<Data>dataList13 = new ArrayList<>();
          String url="jdbc:postgresql://localhost:5432/postgres";
          String user = "postgres";
          String password = "postgres";
       
         
       try {           
           Class.forName("org.postgresql.Driver");
           
       con = DriverManager.getConnection(url,user,password);
       String query1="SELECT * FROM "+table;
       Statement st=con.createStatement();
       ResultSet rs =  st.executeQuery(query1);
       Data data;
       while(rs.next()){
           data=new Data(rs.getInt("posotita"),rs.getDouble("timi"),rs.getString("eidos"),rs.getString("sxolio"));
           dataList13.add(data);
       }
       }
           catch (Exception ex){
         JOptionPane.showMessageDialog(null, ex);
           
       }
       return dataList13;
    }
     public ArrayList<Data>dataList14(){
         table="table14";
        ArrayList<Data>dataList14 = new ArrayList<>();
          String url="jdbc:postgresql://localhost:5432/postgres";
          String user = "postgres";
          String password = "postgres";
       
         
       try {           
           Class.forName("org.postgresql.Driver");
           
       con = DriverManager.getConnection(url,user,password);
       String query1="SELECT * FROM "+table;
       Statement st=con.createStatement();
       ResultSet rs =  st.executeQuery(query1);
       Data data;
       while(rs.next()){
           data=new Data(rs.getInt("posotita"),rs.getDouble("timi"),rs.getString("eidos"),rs.getString("sxolio"));
           dataList14.add(data);
       }
       }
           catch (Exception ex){
         JOptionPane.showMessageDialog(null, ex);
           
       }
       return dataList14;
    }
     public ArrayList<Data>dataList15(){
         table="table15";
        ArrayList<Data>dataList15 = new ArrayList<>();
          String url="jdbc:postgresql://localhost:5432/postgres";
          String user = "postgres";
          String password = "postgres";
       
         
       try {           
           Class.forName("org.postgresql.Driver");
           
       con = DriverManager.getConnection(url,user,password);
       String query1="SELECT * FROM "+table;
       Statement st=con.createStatement();
       ResultSet rs =  st.executeQuery(query1);
       Data data;
       while(rs.next()){
           data=new Data(rs.getInt("posotita"),rs.getDouble("timi"),rs.getString("eidos"),rs.getString("sxolio"));
           dataList15.add(data);
       }
       }
           catch (Exception ex){
         JOptionPane.showMessageDialog(null, ex);
           
       }
       return dataList15;
    }
    public void show_data(){
        ArrayList<Data> list = dataList();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = {0,1,2,3};
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).geteidos();
            row[1]=list.get(i).getposotita();
            row[2]=list.get(i).gettimi();
            row[3]=list.get(i).getsxolio();
            model.addRow(row);
            
            
            sunolo=(list.get(i).gettimi()*list.get(i).getposotita()+sunolo);
            
            sunoliki.setText(String.valueOf(sunolo));
            
        } 
    }
     public void show_data2(){
        ArrayList<Data> list = dataList2();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = {0,1,2,3};
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).geteidos();
            row[1]=list.get(i).getposotita();
            row[2]=list.get(i).gettimi();
            row[3]=list.get(i).getsxolio();
            model.addRow(row);
            sunolo=(list.get(i).gettimi()*list.get(i).getposotita()+sunolo);
            
            sunoliki.setText(String.valueOf(sunolo));
        } 
    }
      public void show_data3(){
        ArrayList<Data> list = dataList3();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = {0,1,2,3};
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).geteidos();
            row[1]=list.get(i).getposotita();
            row[2]=list.get(i).gettimi();
            row[3]=list.get(i).getsxolio();
            model.addRow(row);
            sunolo=(list.get(i).gettimi()*list.get(i).getposotita()+sunolo);
            
            sunoliki.setText(String.valueOf(sunolo));
        } 
    }
       public void show_data4(){
        ArrayList<Data> list = dataList4();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = {0,1,2,3};
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).geteidos();
            row[1]=list.get(i).getposotita();
            row[2]=list.get(i).gettimi();
            row[3]=list.get(i).getsxolio();
            model.addRow(row);
            sunolo=(list.get(i).gettimi()*list.get(i).getposotita()+sunolo);
            
            sunoliki.setText(String.valueOf(sunolo));
        } 
    }
        public void show_data5(){
        ArrayList<Data> list = dataList5();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = {0,1,2,3};
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).geteidos();
            row[1]=list.get(i).getposotita();
            row[2]=list.get(i).gettimi();
            row[3]=list.get(i).getsxolio();
            model.addRow(row);
            sunolo=(list.get(i).gettimi()*list.get(i).getposotita()+sunolo);
            
            sunoliki.setText(String.valueOf(sunolo));
        } 
    }
         public void show_data6(){
        ArrayList<Data> list = dataList6();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = {0,1,2,3};
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).geteidos();
            row[1]=list.get(i).getposotita();
            row[2]=list.get(i).gettimi();
            row[3]=list.get(i).getsxolio();
            model.addRow(row);
            sunolo=(list.get(i).gettimi()*list.get(i).getposotita()+sunolo);
            
            sunoliki.setText(String.valueOf(sunolo));
        } 
    }
          public void show_data7(){
        ArrayList<Data> list = dataList7();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = {0,1,2,3};
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).geteidos();
            row[1]=list.get(i).getposotita();
            row[2]=list.get(i).gettimi();
            row[3]=list.get(i).getsxolio();
            model.addRow(row);
            sunolo=(list.get(i).gettimi()*list.get(i).getposotita()+sunolo);
            
            sunoliki.setText(String.valueOf(sunolo));
        } 
    }
           public void show_data8(){
        ArrayList<Data> list = dataList8();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = {0,1,2,3};
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).geteidos();
            row[1]=list.get(i).getposotita();
            row[2]=list.get(i).gettimi();
            row[3]=list.get(i).getsxolio();
            model.addRow(row);
            sunolo=(list.get(i).gettimi()*list.get(i).getposotita()+sunolo);
            
            sunoliki.setText(String.valueOf(sunolo));
        } 
    }
            public void show_data9(){
        ArrayList<Data> list = dataList9();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = {0,1,2,3};
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).geteidos();
            row[1]=list.get(i).getposotita();
            row[2]=list.get(i).gettimi();
            row[3]=list.get(i).getsxolio();
            model.addRow(row);
            sunolo=(list.get(i).gettimi()*list.get(i).getposotita()+sunolo);
            
            sunoliki.setText(String.valueOf(sunolo));
        } 
    }
             public void show_data10(){
        ArrayList<Data> list = dataList10();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = {0,1,2,3};
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).geteidos();
            row[1]=list.get(i).getposotita();
            row[2]=list.get(i).gettimi();
            row[3]=list.get(i).getsxolio();
            model.addRow(row);
            sunolo=(list.get(i).gettimi()*list.get(i).getposotita()+sunolo);
            
            sunoliki.setText(String.valueOf(sunolo));
        } 
    }
              public void show_data11(){
        ArrayList<Data> list = dataList11();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = {0,1,2,3};
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).geteidos();
            row[1]=list.get(i).getposotita();
            row[2]=list.get(i).gettimi();
            row[3]=list.get(i).getsxolio();
            model.addRow(row);
            sunolo=(list.get(i).gettimi()*list.get(i).getposotita()+sunolo);
            
            sunoliki.setText(String.valueOf(sunolo));
        } 
    }
               public void show_data12(){
        ArrayList<Data> list = dataList12();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = {0,1,2,3};
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).geteidos();
            row[1]=list.get(i).getposotita();
            row[2]=list.get(i).gettimi();
            row[3]=list.get(i).getsxolio();
            model.addRow(row);
            sunolo=(list.get(i).gettimi()*list.get(i).getposotita()+sunolo);
            
            sunoliki.setText(String.valueOf(sunolo));
        } 
    }
                public void show_data13(){
        ArrayList<Data> list = dataList13();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = {0,1,2,3};
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).geteidos();
            row[1]=list.get(i).getposotita();
            row[2]=list.get(i).gettimi();
            row[3]=list.get(i).getsxolio();
            model.addRow(row);
            sunolo=(list.get(i).gettimi()*list.get(i).getposotita()+sunolo);
            
            sunoliki.setText(String.valueOf(sunolo));
        } 
    }
                 public void show_data14(){
        ArrayList<Data> list = dataList14();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = {0,1,2,3};
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).geteidos();
            row[1]=list.get(i).getposotita();
            row[2]=list.get(i).gettimi();
            row[3]=list.get(i).getsxolio();
            model.addRow(row);
            sunolo=(list.get(i).gettimi()*list.get(i).getposotita()+sunolo);
            
            sunoliki.setText(String.valueOf(sunolo));
        } 
    }
                  public void show_data15(){
        ArrayList<Data> list = dataList15();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = {0,1,2,3};
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).geteidos();
            row[1]=list.get(i).getposotita();
            row[2]=list.get(i).gettimi();
            row[3]=list.get(i).getsxolio();
            model.addRow(row);
            sunolo=(list.get(i).gettimi()*list.get(i).getposotita()+sunolo);
            
            sunoliki.setText(String.valueOf(sunolo));
        } 
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        rofimata = new javax.swing.JList(rofimatapin);
        jSpinner4 = new javax.swing.JSpinner();
        jButtonRofimata = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        sxoliorofimata = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        xumoi = new javax.swing.JList(xumoipin);
        jSpinner2 = new javax.swing.JSpinner();
        jButtonXymoi = new javax.swing.JButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        sxolioxum = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jSpinner6 = new javax.swing.JSpinner();
        jButtonAnapsiktika = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        anapsiktika = new javax.swing.JList(anapsiktikapin);
        jScrollPane11 = new javax.swing.JScrollPane();
        sxolioanaps = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        pota = new javax.swing.JList(potapin);
        jSpinner3 = new javax.swing.JSpinner();
        jButtonPota = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        sxoliopota = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        sunoliki = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        RESET = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        mpures = new javax.swing.JList(mpurapin);
        jSpinner7 = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        sxoliompur = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane3 = new javax.swing.JScrollPane();
        coffees = new javax.swing.JList(coffee);
        jButton2 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        sxoliocoffee = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        jLabel14.setText("jLabel14");

        jScrollPane2.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N

        rofimata.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jScrollPane4.setViewportView(rofimata);

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jButtonRofimata.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButtonRofimata.setText("ΠΡΟΣΘΗΚΗ ");
        jButtonRofimata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRofimataActionPerformed(evt);
            }
        });

        sxoliorofimata.setColumns(20);
        sxoliorofimata.setRows(5);
        sxoliorofimata.setToolTipText("");
        sxoliorofimata.setBorder(javax.swing.BorderFactory.createTitledBorder("ΣΧΟΛΙΟ"));
        jScrollPane12.setViewportView(sxoliorofimata);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jButtonRofimata))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jButtonRofimata, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("ΡΟΦΗΜΑΤΑ", jPanel2);

        xumoi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jScrollPane6.setViewportView(xumoi);

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jButtonXymoi.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButtonXymoi.setText("ΠΡΟΣΘΗΚΗ ");
        jButtonXymoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXymoiActionPerformed(evt);
            }
        });

        sxolioxum.setColumns(20);
        sxolioxum.setRows(5);
        sxolioxum.setToolTipText("");
        sxolioxum.setBorder(javax.swing.BorderFactory.createTitledBorder("ΣΧΟΛΙΟ"));
        jScrollPane14.setViewportView(sxolioxum);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jButtonXymoi))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jButtonXymoi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("ΧΥΜΟΙ", jPanel3);

        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jButtonAnapsiktika.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButtonAnapsiktika.setText("ΠΡΟΣΘΗΚΗ ");
        jButtonAnapsiktika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnapsiktikaActionPerformed(evt);
            }
        });

        anapsiktika.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jScrollPane7.setViewportView(anapsiktika);

        sxolioanaps.setColumns(20);
        sxolioanaps.setRows(5);
        sxolioanaps.setToolTipText("");
        sxolioanaps.setBorder(javax.swing.BorderFactory.createTitledBorder("ΣΧΟΛΙΟ"));
        jScrollPane11.setViewportView(sxolioanaps);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jButtonAnapsiktika)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jButtonAnapsiktika, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("ΑΝΑΨΥΚΤΙΚΑ", jPanel4);

        pota.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jScrollPane5.setViewportView(pota);

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jButtonPota.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButtonPota.setText("ΠΡΟΣΘΗΚΗ ");
        jButtonPota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPotaActionPerformed(evt);
            }
        });

        sxoliopota.setColumns(20);
        sxoliopota.setRows(5);
        sxoliopota.setToolTipText("");
        sxoliopota.setBorder(javax.swing.BorderFactory.createTitledBorder("ΣΧΟΛΙΟ"));
        jScrollPane13.setViewportView(sxoliopota);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jButtonPota)))
                .addGap(10, 10, 10))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jButtonPota, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("ΠΟΤΑ", jPanel5);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ΕΙΔΟΣ", "ΠΟΣΟΤΗΤΑ", "ΤΙΜΗ ΜΟΝΑΔΑΣ", "ΣΧΟΛΙΟ"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("ΣΥΝΟΛΟ:");

        sunoliki.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sunoliki.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sunoliki.setText("0");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setText("ΕΥΡΩ");

        RESET.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        RESET.setText("RESET");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel12)
                        .addGap(93, 93, 93)
                        .addComponent(sunoliki, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addGap(0, 152, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(RESET, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(sunoliki)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(RESET)
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("ΣΥΝΟΛΟ", jPanel7);

        mpures.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jScrollPane9.setViewportView(mpures);

        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jButton3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButton3.setText("ΠΡΟΣΘΗΚΗ ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        sxoliompur.setColumns(20);
        sxoliompur.setRows(5);
        sxoliompur.setToolTipText("");
        sxoliompur.setBorder(javax.swing.BorderFactory.createTitledBorder("ΣΧΟΛΙΟ"));
        jScrollPane10.setViewportView(sxoliompur);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jButton3)
                .addGap(175, 175, 175))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("ΜΠΥΡΕΣ", jPanel8);

        jPanel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        coffees.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jScrollPane3.setViewportView(coffees);

        jButton2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButton2.setText("ΠΡΟΣΘΗΚΗ ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        sxoliocoffee.setColumns(20);
        sxoliocoffee.setRows(5);
        sxoliocoffee.setToolTipText("");
        sxoliocoffee.setBorder(javax.swing.BorderFactory.createTitledBorder("ΣΧΟΛΙΟ"));
        jScrollPane8.setViewportView(sxoliocoffee);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(129, 129, 129)
                        .addComponent(jButton2)
                        .addGap(175, 175, 175))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))))
        );

        jTabbedPane1.addTab("ΚΑΦΕΔΕΣ", jPanel1);

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("ΠΙΣΩ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ERGASIA ERGASIA= new ERGASIA();
        ERGASIA.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int idx= coffees.getSelectedIndex();
        
        String coffeetype=coffee[idx];
        String coffeeposotita = String.valueOf(jSpinner1.getValue());
        String sxolio=sxoliocoffee.getText();
        posotita = Integer.valueOf(coffeeposotita);
        timi = coffeeprice[idx];
        Object[] row = { coffeetype, posotita, timi,sxolio};
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(row);
        sunolo  = sunolo + (posotita*timi);
        sunoliki.setText(String.valueOf(sunolo));
        sxoliocoffee.setText("");
        
          try{
       String sqlQuery = "INSERT INTO "+table+" (eidos,posotita,timi,sxolio)\n" +
        "Values("+"'"+coffeetype+"'"+","+posotita+","+timi+","+"'"+sxolio+"'"+")";
       
       PreparedStatement pst = con.prepareStatement(sqlQuery);
       pst.executeQuery();
       JOptionPane.showMessageDialog(null, "Data insert succesfully");
        
        
                     }
       catch (SQLException ex){
         JOptionPane.showMessageDialog(null, ex);
           
       }
               
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonAnapsiktikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnapsiktikaActionPerformed
        int idx1= anapsiktika.getSelectedIndex();
        String anapsiktikatype=anapsiktikapin[idx1];
        String anapsiktikaposotita = String.valueOf(jSpinner6.getValue());
        String sxolio=sxolioanaps.getText();
        posotita = Integer.valueOf(anapsiktikaposotita);
        timi = anapsiktikaprice[idx1];
        Object[] row = { anapsiktikatype, posotita, timi,sxolio};
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(row);
        sunolo  = sunolo + (posotita*timi);
        sunoliki.setText(String.valueOf(sunolo));
        sxolioanaps.setText("");
         try{
       String sqlQuery = "INSERT INTO "+table+" (eidos,posotita,timi,sxolio)\n" +
        "Values("+"'"+anapsiktikatype+"'"+","+posotita+","+timi+","+"'"+sxolio+"'"+")";
       
       PreparedStatement pst = con.prepareStatement(sqlQuery);
       pst.executeQuery();
       JOptionPane.showMessageDialog(null, "Data insert succesfully");
        
        
                     }
       catch (SQLException ex){
         JOptionPane.showMessageDialog(null, ex);
           
       }
    }//GEN-LAST:event_jButtonAnapsiktikaActionPerformed

    private void jButtonRofimataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRofimataActionPerformed
        int idx1= rofimata.getSelectedIndex();
        String rofimatatype=rofimatapin[idx1];
        String rofimataposotita = String.valueOf(jSpinner4.getValue());
        String sxolio=sxoliorofimata.getText();
        posotita = Integer.valueOf(rofimataposotita);
        timi = rofimataprice[idx1];
        Object[] row = { rofimatatype, posotita, timi,sxolio};
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(row);
        sunolo  = sunolo + (posotita*timi);
        sunoliki.setText(String.valueOf(sunolo));
        sxoliorofimata.setText("");
        try{
       String sqlQuery = "INSERT INTO "+table+" (eidos,posotita,timi,sxolio)\n" +
        "Values("+"'"+rofimatatype+"'"+","+posotita+","+timi+","+"'"+sxolio+"'"+")";
       
       PreparedStatement pst = con.prepareStatement(sqlQuery);
       pst.executeQuery();
       JOptionPane.showMessageDialog(null, "Data insert succesfully");
        
        
                     }
       catch (SQLException ex){
         JOptionPane.showMessageDialog(null, ex);
           
       }
    }//GEN-LAST:event_jButtonRofimataActionPerformed

    private void jButtonPotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPotaActionPerformed
       int idx1= pota.getSelectedIndex();
        String potatype=potapin[idx1];
        String potaposotita = String.valueOf(jSpinner3.getValue());
        String sxolio=sxoliopota.getText();
        posotita = Integer.valueOf(potaposotita);
        timi = potaprice[idx1];
        Object[] row = { potatype, posotita, timi,sxolio};
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(row);
        sunolo  = sunolo + (posotita*timi);
        sunoliki.setText(String.valueOf(sunolo));
        sxoliopota.setText("");
        try{
       String sqlQuery = "INSERT INTO "+table+" (eidos,posotita,timi,sxolio)\n" +
        "Values("+"'"+potatype+"'"+","+posotita+","+timi+","+"'"+sxolio+"'"+")";
       
       PreparedStatement pst = con.prepareStatement(sqlQuery);
       pst.executeQuery();
       JOptionPane.showMessageDialog(null, "Data insert succesfully");
        
        
                     }
       catch (SQLException ex){
         JOptionPane.showMessageDialog(null, ex);
           
       }
    }//GEN-LAST:event_jButtonPotaActionPerformed

    private void jButtonXymoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXymoiActionPerformed
         int idx1= xumoi.getSelectedIndex();
        String xumoitype=xumoipin[idx1];
        String xumoiposotita = String.valueOf(jSpinner2.getValue());
        String sxolio=sxolioxum.getText();
        posotita = Integer.valueOf(xumoiposotita);
        timi = xumoiprice[idx1];
        Object[] row = { xumoitype, posotita, timi,sxolio};
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(row);
        sunolo  = sunolo + (posotita*timi);
        sunoliki.setText(String.valueOf(sunolo));
        sxolioxum.setText("");
        try{
       String sqlQuery = "INSERT INTO "+table+" (eidos,posotita,timi,sxolio)\n" +
        "Values("+"'"+xumoitype+"'"+","+posotita+","+timi+","+"'"+sxolio+"'"+")";
       
       PreparedStatement pst = con.prepareStatement(sqlQuery);
       pst.executeQuery();
       JOptionPane.showMessageDialog(null, "Data insert succesfully");
        
        
                     }
       catch (SQLException ex){
         JOptionPane.showMessageDialog(null, ex);
           
       }
    }//GEN-LAST:event_jButtonXymoiActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          int idx1= mpures.getSelectedIndex();
        String mpuratype=mpurapin[idx1];
        String mpuraposotita = String.valueOf(jSpinner7.getValue());
        String sxolio=sxoliompur.getText();
        posotita = Integer.valueOf(mpuraposotita);
        timi = mpuraprice[idx1];
        Object[] row = { mpuratype, posotita, timi,sxolio};
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(row);
        sunolo  = sunolo + (posotita*timi);
        sunoliki.setText(String.valueOf(sunolo));
        sxoliompur.setText("");
        try{
       String sqlQuery = "INSERT INTO "+table+" (eidos,posotita,timi,sxolio)\n" +
        "Values("+"'"+mpuratype+"'"+","+posotita+","+timi+","+"'"+sxolio+"'"+")";
       
       PreparedStatement pst = con.prepareStatement(sqlQuery);
       pst.executeQuery();
       JOptionPane.showMessageDialog(null, "Data insert succesfully");
        
        
                     }
       catch (SQLException ex){
         JOptionPane.showMessageDialog(null, ex);
           
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        
        try{
       String sqlQuery = "DELETE FROM "+table;
       
       PreparedStatement pst = con.prepareStatement(sqlQuery);
       pst.executeQuery();
       JOptionPane.showMessageDialog(null, "Data insert succesfully");
        
        
                     }
       catch (SQLException ex){
         JOptionPane.showMessageDialog(null, ex);
           
       }
          
    }//GEN-LAST:event_RESETActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
       
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EPILOGES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EPILOGES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EPILOGES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EPILOGES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EPILOGES().setVisible(true);
                
            }
        });
    }
    String coffee[]={"CAPPUCCINO CLASSIC","CAPPUCCINO DECAFFEINE","CAPPUCCINO FREDDO","ESPRESSO ΜΟΝΟΣ",
        "ESPRESSO ΔΙΠΛΟΣ","ESPRESSO FREDDO",
        "ΕΛΛΗΝΙΚΟΣ ΚΑΦΕΣ ΜΟΝΟΣ", "ΕΛΛΗΝΙΚΟΣ ΚΑΦΕΣ ΔΙΠΛΟΣ","FRAPPE","FILTER COFFEE"};
    double coffeeprice[] = {3,2.50,3.20,2,3,3,1.50,2,2,2};
    
    String anapsiktikapin[]={"COCA COLA","COCA COLA (LIGHT)","COCA COLA (ZERO)"
                          ,"FANTA","SPRITE","ΝΕΡΟ","SODA","FANTA BLUE","LUX ΠΟΡΤΟΚΑΛΙ"};
    double anapsiktikaprice[]={1.20,1.20,1.20,1.20,1.20,0.50,1.20,1.20,1.20};
    
    String xumoipin[]={"ΦΥΣΙΚΟΣ ΠΟΡΤΟΚΑΛΙ","ΜΗΛΟ","ΡΟΔΑΚΙΝΟ","ΒΕΡΙΚΟΚΟ","ΑΝΑΜΕΙΚΤΟΣ","AMITA MOTION"};
    double xumoiprice[]={1.40,1.20,1.20,1.20,1.50,2};
    
    String mpurapin[]={"AMSTEL","HEINEKEN","ΑΛΦΑ","KAIZER","ΒΕΡΓΙΝΑ","FIX"};
    double mpuraprice[]={3,3,2,3.50,3,2};
    
    String potapin[]={"WHISKEY","VODKA","GIN","TEQUILA","LIQUER","RUM"};
    double potaprice[]={8,8,8,8,8,8};
    
    String rofimatapin[]={"HOT ΣΟΚΟΛΑΤΑ","COLD ΣΟΚΟΛΑΤΑ","HOT ΣΟΚΟΛΑΤΑ ΛΕΥΚΗ","COLD ΣΟΚΟΛΑΤΑ ΛΕΥΚΗ","HOT ΤΣΑΙ","COLD ΤΣΑΙ","SMOOTHIE"};
    double rofimataprice[]={3,3,3,3,3,3,4};
    
    int posotita;
    double timi;
    double sunolo; 
    String table;


   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RESET;
    private javax.swing.JList anapsiktika;
    private javax.swing.JList coffees;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAnapsiktika;
    private javax.swing.JButton jButtonPota;
    private javax.swing.JButton jButtonRofimata;
    private javax.swing.JButton jButtonXymoi;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTree jTree1;
    private javax.swing.JList mpures;
    private javax.swing.JList pota;
    private javax.swing.JList rofimata;
    private javax.swing.JLabel sunoliki;
    private javax.swing.JTextArea sxolioanaps;
    private javax.swing.JTextArea sxoliocoffee;
    private javax.swing.JTextArea sxoliompur;
    private javax.swing.JTextArea sxoliopota;
    private javax.swing.JTextArea sxoliorofimata;
    private javax.swing.JTextArea sxolioxum;
    private javax.swing.JList xumoi;
    // End of variables declaration//GEN-END:variables
}
