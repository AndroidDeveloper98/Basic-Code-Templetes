
class RecyclerListAdapter(
    private var context: Context, private var data: ArrayList<String>
) : RecyclerView.Adapter<RecyclerListAdapter.SingleViewHolder>() {

    var onClick: OnItemClickListener? = null

    fun setOnItemClickListener(mOnItemClickListener: OnItemClickListener) {
        this.onClick = mOnItemClickListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SingleViewHolder {
        val binding: ListItemBinding = ListItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return SingleViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    override fun onBindViewHolder(holder: SingleViewHolder, position: Int) {
        holder.binding.title.text = "Data"
    }

    interface OnItemClickListener {
        fun onItemClick(view: View, position: Int)
    }

    inner class SingleViewHolder(val binding: TimerListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {}
}
