fun main (args:Array<String>){
        val arraylist= arrayListOf<Employee>()
        val f = Employee(1, "sokhenh", 1232012, "Phnom penh", "Stree 271")
        val w = Employee(2, "sokhenh", 1232012, "Phnom penh", "Stree 271")
        val e3 = Employee(3, "sokhenh", 1232012, "Phnom penh", "Stree 271")
        val p = Employee(4, "sokhenh", 1232012, "Phnom penh", "Stree 271")
        val o = Employee(5, "sokhenh", 1232012, "Phnom penh", "Stree 271")
        val l = Employee(6, "sokhenh", 1232012, "Phnom penh", "Stree 271")
        val k = Employee(7, "sokhenh", 1232012, "Phnom penh", "Stree 271")
        val m = Employee(8, "sokhenh", 1232012, "Phnom penh", "Stree 271")
        val n = Employee(9, "sokhenh", 1232012, "Phnom penh", "Stree 271")
        val e = Employee(10, "sokhenh", 1232012, "Phnom penh", "Stree 271")
        val a = Employee(11, "sokhenh", 1232012, "Phnom penh", "Stree 271")
        val t = Employee(12, "sokhenh", 1232012, "Phnom penh", "Stree 271")
        val c = Employee(13, "sokhenh", 1232012, "Phnom penh", "Stree 271")
        val b = Employee(14, "sokhenh", 1232012, "Phnom penh", "Stree 271")
        val s = Employee(15, "sokhenh", 1232012, "Phnom penh", "Stree 271")
        val q = Employee(16, "sokhenh", 1232012, "Phnom penh", "Stree 271")
        arraylist.add(q)
        arraylist.add(s)
        arraylist.add(b)
        arraylist.add(c)
        arraylist.add(t)
        arraylist.add(a)
        arraylist.add(e)
        arraylist.add(n)
        arraylist.add(m)
        arraylist.add(l)
        arraylist.add(o)
        arraylist.add(p)
        arraylist.add(e3)
        arraylist.add(w)
        arraylist.add(f)
        for (i in arraylist) {
            println(" ${i.id} ${i.Phone}${i.address}${i.city}${i.name}")
        }
    }class Employee(var id: Int, var name: String, var Phone: Int, var city: String, val address: String)


