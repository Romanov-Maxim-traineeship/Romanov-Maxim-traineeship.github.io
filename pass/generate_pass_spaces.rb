i=0
word = ""
vowels = ["a","e","i","y","o","u"]
consonants = ["b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","x","w","z"]
def randomWord(arg,argtwo)
arg[rand(arg.size)]+argtwo[rand(argtwo.size)]
end
print "use numbers in the password? 1/0 "
boolNum = Integer(gets.chomp)
print "enter the size of password: "
width = Integer(gets.chomp)




case boolNum
  when 0
    DefWidth = width
    remain = 5-(width%5)
    width += remain
    while i < width
      i +=2
      word += randomWord(consonants, vowels)
    end
      result = word[0,DefWidth]
    
  when 1
    print "numbers after or before the password? 1/0 "
    bef_aft = Integer(gets.chomp)
    print "how many numbers? 1/2/3/4/5 ? "
    num = Integer(gets.chomp)

    DefWidth = width-num
    remain = 5-(width%5)
    width += remain
    while i < width
      i +=2
      word += randomWord(consonants, vowels)
    end
    result = word[0,DefWidth]
    def randomNumber(strArg, boolArg, discharge)
    case discharge
      when 1
        quantityBefore = 0
        quantityAfter = 9
      when 2
        quantityBefore = 10
        quantityAfter = 99
      when 3
        quantityBefore = 100
        quantityAfter = 999
      when 4
        quantityBefore = 1000
        quantityAfter = 9999
      when 5
        quantityBefore = 10000
        quantityAfter = 99999
      else
        quantityBefore = 100000
        quantityAfter = 999999
    end

    number = (Random.rand(quantityBefore...quantityAfter)).to_s
    case boolArg
      when 1
        return strArg+number
      when 0
          return number+strArg
      end 
    end
    result = randomNumber(result, bef_aft, num)
    
end
puts result

t = STDIN.gets
