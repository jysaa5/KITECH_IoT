import threading
import datetime

def on_timer(count):
    count += 1
    print(count)
    
    #1초씩 인터벌
    timer = threading.Timer(1, on_timer, args=[count])
    timer.start()

    if count == 10:
        print('Cancelling timer..')
        timer.cancel()

print('Starting timer...')
on_timer(0)