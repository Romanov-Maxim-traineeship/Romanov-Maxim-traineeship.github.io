class Generate 
  VOWELS = ["a","e","i","y","o","u"]
  CONSONANTS = ["b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","x","w","z"]
  attr_accessor :width, :number, :number_size
  def initialize (width = 6, number = 0, number_size = 3)
    @width = width
    @number = number
    @number_size = number_size
  end

  def random_syllable
    Generate::VOWELS[rand(Generate::VOWELS.size)] + Generate::CONSONANTS[rand(Generate::CONSONANTS.size)]
  end

  def random_number
    j = 0
    unit = ""
    while j < @number_size
      j += 1
      unit += (Random.rand(10)).to_s
    end
    return  unit
  end

  def pass
    i = 0
    case @number
    when 0
      remain = 5-(@width%5)
      @width += remain
      word = ""
      while i < @width
        i +=2
        word += random_syllable
      end
        @width -= remain
        result = word[0,@width]
    when 1
      @width -= @number_size
      remain = 5-(@width%5)
      @width += remain
      word = ""
        while i < @width
          i +=2
          word += random_syllable
        end
      result = word[0,(@width - remain)] + random_number
    end
  end
end

item = Generate.new(8, 1, 3)
puts "Ваш пароль: #{item.pass()}"

