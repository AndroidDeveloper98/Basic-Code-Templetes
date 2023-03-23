class MainActivity : AppCompatActivity() {
    private val binding by lazy(LazyThreadSafetyMode.NONE){
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val list : ArrayList<String> = ArrayList()
        for (i in 0..100){
            list.add("")
        }
        binding.rvList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val recyclerListAdapter = RecyclerListAdapter(this, list)
        binding.rvList.adapter = recyclerListAdapter
        recyclerListAdapter.setOnItemClickLitener(object : TimerListAdapter.OnItemClickListener{
            override fun onItemClick(view: View, position: Int) {

            }
        })
    }
}
