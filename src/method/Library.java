package method;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Item> items = new ArrayList<>();   // Composition ke item (buku dan majalah)
    private List<Member> members = new ArrayList<>();   // Composition ke Anggota perpus

    public void addItem(Item item) { // Tambah Item Majalah atau Buku
        items.add(item);
    }

    public void addMember(Member member) { // Tambah Member
        members.add(member);
    }

    public List<Item> getItems() {
        return items;
    }

    public List<Member> getMembers() {
        return members;
    }

    public Item findItemById(String id) {
        return items.stream().filter(i -> i.getId().equals(id)).findFirst().orElse(null);
    }

    public Member findMemberById(String id) {
        return members.stream().filter(m -> m.getId().equals(id)).findFirst().orElse(null);
    }
    
    public void borrowItem(Member member, Item item) {
        if (item != null && !item.isBorrowed()) {
            item.setBorrowed(true); 
            member.setStatus("Borrowing");  // Update status member menjadi Borrowing
            System.out.println(member.getName() + " has borrowed the item: " + item.getTitle());
        } else {
            System.out.println("Item is not available for borrowing.");
        }
    }
}
