#!/usr/bin/env python
# -*- coding: utf-8 -*-

import os

if __name__ == '__main__':
   data = {
      0: 'bubble',
      1: 'insertion',
      2: 'selection',
      3: 'quick',
      4: 'counting',
      5: 'bigger smaller'
   }
   os.system("rm results/*")
   for i in range(0, len(data)):
      for j in range(0, 3):
         count = 10 ** (j + 1)
         for k in range(0, 5):
            print "alg:%s size:%d iter:%d file:%d-%d" % (data[i], count, k, i, count)
            os.system("time -a -o results/%d-%d.txt -f \"%%E\" ./sorty sort %d %d" % (i, count, i, count))