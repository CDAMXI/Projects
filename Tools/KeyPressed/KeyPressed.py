import keyboard

print("Press any key to see what you pressed. Press 'esc' to exit.")

while True:
    # Wait for the next keyboard event
    event = keyboard.read_event()
    
    # We only want to print when the key is pressed down (not when released)
    if event.event_type == keyboard.KEY_DOWN:
        print(f"You pressed: {event.name}")
        
    # Exit the loop if 'esc' is pressed
    if event.name == 'esc' and event.event_type == keyboard.KEY_DOWN:
        print("Exiting...")
        break
