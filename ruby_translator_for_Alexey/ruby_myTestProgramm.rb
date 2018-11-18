require 'net/http'
require 'json'

module Translate
  class Translator

    BASE_URL = 'https://translate.yandex.net/api/v1.5/tr.json/translate'
    attr_accessor :key

    def initialize(key, first_lang, last_lang)
      @key = key
      @first_lang = first_lang
      @last_lang = last_lang
    end

    def translator(text_for_translate)
      url = "#{BASE_URL}?key=#{@key}&text=#{text_for_translate}&lang=#{@first_lang}-#{@last_lang}"
      uri = URI(url)
      response = Net::HTTP.get(uri)
      JSON.parse(response)['text']
    end

  end

  class GetLang
    BASE_URL = 'https://translate.yandex.net/api/v1.5/tr.json/getLangs'

    attr_accessor :key

    def initialize(key)
      @key = key
    end

    def get_lang(ui)
      url = "#{BASE_URL}?ui=#{ui}&key=#{@key}"
      uri = URI(url)
      response = Net::HTTP.get(uri)
      JSON.parse(response)
    end
  end

  class DefinitionLanguage
    BASE_URL = 'https://translate.yandex.net/api/v1.5/tr.json/detect'

    def initialize(key)
      @key = key
    end

    def definition_text(definition_text)
      url = "#{BASE_URL}?key=#{@key}&text=#{definition_text}&hint=en,ru"
      uri = URI(url)
      response = Net::HTTP.get(uri)
      JSON.parse(response)['lang']
    end
  end
end

class Test
  include Translate

  text = Translator.new('trnsl.1.1.20181113T124855Z.265a3dbb4ed09a6b.898310b6c4a33ca9d35f5d9c39561a578b93a8b3', 'ru', 'de')

  puts text.translator('привет')

  text_definition = DefinitionLanguage.new('trnsl.1.1.20181113T124855Z.265a3dbb4ed09a6b.898310b6c4a33ca9d35f5d9c39561a578b93a8b3')

  puts text_definition.definition_text('hello')

end

