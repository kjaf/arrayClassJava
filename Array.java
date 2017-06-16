package ArrayClass;

import java.io.IOException;
import java.util.Arrays;

public class Array {
	
	private static final int DEFAULT_SIZE = 100;
	private char[] data_; 
	private int max_size_;
	private int cur_size_; 
	
	
	
	//default constructor
	public Array(){
		this.data_ = new char[DEFAULT_SIZE];
		this.max_size_ = DEFAULT_SIZE;
		this.cur_size_ = 0; 
	}
	
	//initializing constructor with length with user specifing a length
	public Array(int length){
		if(length > DEFAULT_SIZE){
			this.max_size_ = length;
		}else{
			this.max_size_ = DEFAULT_SIZE; 
		}
		
		this.cur_size_ = length; 
		this.data_ = new char[this.max_size_];
	}
	
	//initializing a constructor with length and fill
	public Array(int length, char fill){
		
		if(length > DEFAULT_SIZE){
			this.max_size_ = length; 
		}else{
			this.max_size_ = DEFAULT_SIZE; 
		}
		
		this.cur_size_= length; 
		this.data_ = new char[this.max_size_];
		this.fill(fill);
	}
	
	//copy constructor 
	public Array(Array array){
		if(array.cur_size_ > DEFAULT_SIZE){
			this.max_size_ = array.cur_size_;
		}else{
			this.max_size_ = DEFAULT_SIZE; 
		}
		
		this.data_ = new char[this.max_size_];
		this.cur_size_ = array.cur_size_;
		
		for(int x = 0; x < array.cur_size_; x++){
			
			this.data_[x] = array.data_[x];
		}
	}
	
	//sets two arrays equal to each other
	public Array setArrayEqual(Array rhs){
		
		if(this == rhs){
			System.out.println("assignment to yourself is not allowed");
			return this;
		}
		
		if(this.max_size_ < rhs.cur_size_){
			int length = rhs.cur_size_ + DEFAULT_SIZE;
			//sets new current and max size
			this.resize(length);

			
			data_ = new char[this.max_size_];
			
		
		
			
			
			
		}
		
		this.cur_size_ = rhs.cur_size_; 
		
		for(int x = 0; x< rhs.cur_size_; x++){
			this.data_[x] = rhs.data_[x];
		}
		
		return this; 
	}
	
	//gets character at specified index
	public char get(int index) throws outOfBoundsException{
		if(index> this.cur_size_){
			throw new outOfBoundsException("index out of bounds");
		}
		
		return this.data_[index];
	}
	
	//sets value at specified index
	public void set(int index, char value) throws outOfBoundsException{
		if(index >= this.cur_size_){
			throw new outOfBoundsException("index out of bounds");
		}
		this.data_[index] = value; 
	}
	
	//finds index where character is 
	public int find(char ch){
		int notFound = -1; 
		
		for(int x =0; x < this.cur_size_; x++){
			if(data_[x] == ch){
				return x;
			}
		}
		
		return notFound; 
	}
	
	//find method starting at a specific index
	public int find(char ch, int start) throws outOfBoundsException{
		int notFound = -1; 
		
		if(start > this.cur_size_){
			throw new outOfBoundsException("index out of bounds");
		}
		
		for(int x = start; x< this.cur_size_; x++){
			if(this.data_[x] == ch){
				return x;
			}
		}
		
		return notFound; 
		
	}
	
	//check the array for equality
	
	public boolean isArrayEqual(Array rhs){
		if( this == rhs){
			return true;
		}
		
		if(this.cur_size_ != rhs.cur_size_){
			return false;
		}else{
			for(int x = 0; x < this.cur_size_; x++){
				if(this.data_[x] != rhs.data_[x]){
					return false; 
				}
			}
		}
		
		return true; 
	}
	
	//check array for inequality
	public boolean isArrayNotEqual(Array rhs){
		return !(this == rhs);
	}
	
	
	
	
	//resizes the array to a different size. Keeps the contents of the array
	public void resize(int new_size){
		if(new_size < this.cur_size_){
			this.cur_size_ = new_size;
		}else if(new_size > this.cur_size_){
			int length = new_size; 
			Array temp = new Array(length);
	
			for(int x =0; x< this.cur_size_; x++){
				temp.data_[x] = data_[x];
			}
			
			data_ = new char[temp.max_size_];
			
			for(int x=0; x<this.cur_size_; x++){
				data_[x] = temp.data_[x];
			}
			
			
			
			this.max_size_ = temp.max_size_; 
			this.cur_size_ = temp.cur_size_;
		}
	}
	
	
	
	
	
	
	
	//fills the contents of the array 
	public void fill(char ch){
		for(int x = 0; x < this.cur_size_; x++){
			this.data_[x] = ch; 
		}
	}
	
	
	
	
	
	
	
	
	
	

}
