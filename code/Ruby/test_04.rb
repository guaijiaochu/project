require 'watir-webdriver'
include Watir
require 'test/unit'
class TC_recorded < Test::Unit::TestCase
    def test_recorded
     @@b = Watir::Browser.new
     @@b.goto('http://www.hao123.com/')
     @@b.text_field(:name, 'word').set('ruby')
     @@b.text_field(:name, 'word').set('ruby')
     @@b.button(:value, '百度一下').click
    end
end