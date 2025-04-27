package method;

public class Loan {
    public void processLoan(Member member, Item item, String loanDate) { //Dependensi ke member dan item
        if ("Available".equals(member.getStatus())) {
        member.setStatus("Borrowing"); // Update status anggota
        item.setBorrowed(true);    
        System.out.println("Peminjaman buku berhasil oleh " + member.getName() + " pada " + loanDate);
        } else {
            System.out.println("Anggota ini telah meminjam Item yang lain.");
        }
    }
}
