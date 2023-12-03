package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.test.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

var count=0
        binding.numClear.setOnClickListener {

            val data:String=" "
            binding.getText.setText(data)
            binding.showResult.setText(data)
            count=0

        }

        binding.num1.setOnClickListener {
            binding.getText.append("1")
        }

        binding.num2.setOnClickListener {
            binding.getText.append("2")
        }

        binding.num3.setOnClickListener {
            binding.getText.append("3")
        }

        binding.num4.setOnClickListener {
            binding.getText.append("4")
        }

        binding.num5.setOnClickListener {
            binding.getText.append("5")
        }

        binding.num6.setOnClickListener {
            binding.getText.append("6")
        }

        binding.num7.setOnClickListener {
            binding.getText.append("7")
        }

        binding.num8.setOnClickListener {
            binding.getText.append("8")
        }

        binding.num9.setOnClickListener {
            binding.getText.append("9")
        }
        binding.num0.setOnClickListener {
            binding.getText.append("0")
        }

        binding.numDot.setOnClickListener {
            if(count==0) {
                binding.getText.append(".")
                count=count+1
            }
        }

        binding.numSum.setOnClickListener {
            binding.getText.append("+")
            count=0
        }

        binding.numSub.setOnClickListener {
            binding.getText.append("-")
            count=0
        }

        binding.numMul.setOnClickListener {
            binding.getText.append("*")
            count=0
        }

        binding.numDiv.setOnClickListener {
            binding.getText.append("/")
            count=0
        }

        binding.numLog.setOnClickListener {
            binding.getText.append("log(")
        }
        binding.numBrac1.setOnClickListener {
            binding.getText.append("(")
        }
        binding.numBrac2.setOnClickListener {
            binding.getText.append(")")
        }

        binding.numEqual.setOnClickListener {
try {
    if(binding.getText.text.isBlank()){
        Toast.makeText(this,"Empty data",Toast.LENGTH_SHORT).show()
    }
    else {
        val num = binding.getText.text.toString()
        val res = ExpressionBuilder(num).build().evaluate()
        binding.showResult.text = res.toString()
    }
}catch (e:  ArithmeticException){
Toast.makeText(this,"I don't Know ",Toast.LENGTH_SHORT).show()
}
            catch (e: IllegalArgumentException){
                Toast.makeText(this,"I don't Know ",Toast.LENGTH_SHORT).show()
            }

        }
    }
}