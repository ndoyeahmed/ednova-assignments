RANGE_START = 1;
RANGE_END = 100;
MAX_ATTEMPTS = 0;

def generate_random_number(range_start : Int32, range_end : Int32) : Int32
    puts "Generating random number from #{range_start} to #{range_end}";
    return rand(range_start..range_end);
end

def get_user_guess(range_start : Int32, range_end : Int32)
    puts "Guess a number between #{range_start} and #{range_end}";
    user_guess = gets;
    begin
        user_guess = user_guess.not_nil!.to_i;
        if range_start <= user_guess && user_guess <= range_end
            return user_guess;
        else
            puts "Please enter a number within the range #{range_start} - #{range_end}";
            return nil;
        end
    rescue
        puts "Invalid input. Please enter a number.";
        return nil;
    end
end

def process_guess(guess : Int32, target : Int32)
    if guess == target
        return "Congratulations! You guessed the correct number.";
    elsif guess < target
        return "Too low. Try again.";
    else
        return "Too high. Try again.";
    end
end

def play_game()
    puts "Welcome to the Guess The Number game."
    target_number = generate_random_number(RANGE_START, RANGE_END);
    attempts = 0;

    while true
        guess = get_user_guess(RANGE_START, RANGE_END);
        begin
            guess = guess.not_nil!.to_i;
            attempts = attempts + 1;
            feedback = process_guess(guess, target_number);
            puts feedback;
            if guess == target_number
                puts "You guessed it in #{attempts} attempts.";
                break;
            end
        rescue
            attempts = attempts + 1;
            next;
        end
        
        if MAX_ATTEMPTS > 0 && attempts >= MAX_ATTEMPTS
            puts "Sorry, you've exceeded the maximum number of attempts. The correct number was #{target_number}.";
            break;
        end
    end
end

play_game();