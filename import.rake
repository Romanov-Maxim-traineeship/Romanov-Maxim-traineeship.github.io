require "csv"
namespace :import do
  desc "Import prospects from CSV file"

  task prospect: :environment do
    csv = CSV.parse('./lib/bd.csv', :headers => true)
    csv.each do |row|
      test.create!(row.to_hash)
    end
  end
end