import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.madlabexam2.Food
import com.example.madlabexam2.R
import com.example.madlabexam2.Activity_main

class FoodAdapter(private val foodList: List<Food>, private val listener1: Activity_main) :
    RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foodImageView: ImageView = itemView.findViewById(R.id.imageView)
        val foodNameTv: TextView = itemView.findViewById(R.id.textView)

        fun bind(position: Int, listener: Activity_main) {
            itemView.setOnClickListener {
                listener.onClick(position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return FoodViewHolder(view)
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food = foodList[position]
        holder.foodImageView.setImageResource(food.foodiamge)
        holder.foodNameTv.text = food.foodname

        holder.bind(position, listener1)
    }

    interface FoodAdapterClickListener {
        fun onClick(position: Int)
    }
    interface myclicklistner{
        fun onClick(position: Int){

        }
    }
}
