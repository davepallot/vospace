cd /Users/mjg/Projects/noao/vospace/data
rm -rf *
cd ..
#cp /Users/mjg/Projects/noao/vospace/vospace-2.0/python/test/burbidge.vot data/node12
cp /Users/mjg/Projects/noao/vospace/vospace-2.0/python/test/file.dat data/node10
cp /Users/mjg/Projects/noao/vospace/vospace-2.0/python/test/file.dat data/node10a
cp /Users/mjg/Projects/noao/vospace/vospace-2.0/python/test/file.dat data/node10b
mysql -u root -p < /Users/mjg/Projects/noao/vospace/vospace-2.0/python/cleardb.sql
