require 'net/http'
require 'json'
require_relative 'translator/get_langs'
require_relative 'translator/definition'
require_relative 'translator/translate'


module Yandex
  $key = 'trnsl.1.1.20181113T124855Z.265a3dbb4ed09a6b.898310b6c4a33ca9d35f5d9c39561a578b93a8b3'
  class Translator
    include Yandex::Translator::GetLang
    include Yandex::Translator::Definition
    include Yandex::Translator::Translate


    def self.request(url)
      uri = URI(url)
      response = Net::HTTP.get(uri)
      JSON.parse(response)
    end

    puts Translate.translate('my cup is broken', 'ru')
  end
end