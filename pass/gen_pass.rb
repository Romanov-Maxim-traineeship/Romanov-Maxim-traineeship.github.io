class Generate 
  attr_accessor :width, :number, :number_size

  def initialize (width = 6, number = 0, number_size = 3)
    @width = width
    @number = number
    @number_size = number_size
  end

  def random_vowels()
    vowels = ["a","e","i","y","o","u"]
    vowels[rand(vowels.size)]
  end

  def random_consonants()
    consonants = ["b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","x","w","z"]
    consonants[rand(consonants.size)]
  end

  def pass()
    case @number
    when 0
    i = 0
    remain = 5-(@width%5)
    @width += remain
    word = ""
    while i < @width
      i +=2
      word += random_consonants() + random_vowels()
    end
      @width -= remain
      result = word[0,@width]
    when 1
    i = 0
    j = 0
    unit = ""
    @width -= @number_size
    while j < @number_size
      j += 1
      unit += (Random.rand(10)).to_s
    end
    remain = 5-(@width%5)
    @width += remain
    word = ""
      while i < @width
        i +=2
        word += random_consonants() + random_vowels()
      end
    @width -= remain
    result = word[0,@width]
    result += unit
    end

  end
  
end

item = Generate.new(8)
puts "Ваш пароль: #{item.pass()}"

